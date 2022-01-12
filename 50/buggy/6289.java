@java.lang.Override
public void mouseDown(int buttons) {
    if ((org.sikuli.script.RobotDesktop.heldButtons) != 0) {
        org.sikuli.basics.Debug.error("mouseDown: buttons still pressed - using all", buttons, org.sikuli.script.RobotDesktop.heldButtons);
        org.sikuli.script.RobotDesktop.heldButtons |= buttons;
    }else {
        org.sikuli.script.RobotDesktop.heldButtons = buttons;
    }
    doMouseDown(org.sikuli.script.RobotDesktop.heldButtons);
}