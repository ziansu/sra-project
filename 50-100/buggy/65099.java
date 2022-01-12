@java.lang.Override
public void eventDispatched(java.awt.AWTEvent e) {
    if (!(apps.Apps.debugFired)) {
        apps.Apps.debugmsg = true;
        if ((e.getID()) == (java.awt.event.KeyEvent.KEY_PRESSED)) {
            java.awt.event.KeyEvent ky = ((java.awt.event.KeyEvent) (e));
            if ((ky.getKeyCode()) == 119) {
                apps.Apps.startupDebug();
            }
        }else {
            apps.Apps.debugmsg = false;
        }
    }
}