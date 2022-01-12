@java.lang.Override
public boolean dispatchKeyEvent(java.awt.event.KeyEvent e) {
    if (((e.getID()) == (java.awt.event.KeyEvent.KEY_PRESSED)) && (hasFocus)) {
        switch (e.getKeyCode()) {
            case java.awt.event.KeyEvent.VK_ESCAPE :
                dispose();
                break;
            case java.awt.event.KeyEvent.VK_ENTER :
                java.lang.System.out.println("enter");
                check();
                break;
        }
    }
    return false;
}