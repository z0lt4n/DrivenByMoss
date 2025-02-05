// Written by Jürgen Moßgraber - mossgrabers.de
// (c) 2017-2022
// Licensed under LGPLv3 - http://www.gnu.org/licenses/lgpl-3.0.txt

package de.mossgrabers.controller.ni.maschine.jam.view;

import de.mossgrabers.framework.command.trigger.Direction;


/**
 * Can the view be scrolled into a certain direction?.
 *
 * @author J&uuml;rgen Mo&szlig;graber
 */
public interface IViewNavigation
{
    /**
     * Can be scrolled?
     *
     * @param direction The direction to check
     * @return True if it can be scrolled
     */
    boolean canScroll (Direction direction);
}
