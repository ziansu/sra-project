public <PFRML> int paste(PFRML target, java.lang.String text) throws org.sikuli.script.FindFailed {
    if (target != null) {
        click(target, 0);
    }
    if (text != null) {
        org.sikuli.script.App.setClipboard(text);
        int mod = org.sikuli.script.Key.getHotkeyModifier();
        org.sikuli.script.IRobot r = getRobotForRegion();
        r.keyDown(mod);
        r.keyDown(java.awt.event.KeyEvent.VK_V);
        r.keyUp(java.awt.event.KeyEvent.VK_V);
        r.keyUp(mod);
        return 1;
    }
    return 0;
}