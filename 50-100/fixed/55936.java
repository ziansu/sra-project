@java.lang.Override
public void keyPressed(java.awt.event.KeyEvent e) {
    if (((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_S)) && ((e.getModifiers()) == (java.awt.event.KeyEvent.CTRL_MASK))) {
        saveFile();
    }else
        if (((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_R)) && ((e.getModifiers()) == ((java.awt.event.KeyEvent.CTRL_MASK) | (java.awt.event.KeyEvent.SHIFT_MASK)))) {
            getMainFrame().shiftFocusToRawText();
        }
    
}