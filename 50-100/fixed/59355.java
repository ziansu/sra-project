@java.lang.Override
public boolean dispatchKeyEvent(java.awt.event.KeyEvent e) {
    if (((e.getID()) == (java.awt.event.KeyEvent.KEY_PRESSED)) && (hasFocus)) {
        switch (e.getKeyCode()) {
            case java.awt.event.KeyEvent.VK_ESCAPE :
                dispose();
                break;
        }
    }
    return false;
}