@java.lang.Override
public void keyPressed(java.awt.event.KeyEvent e) {
    if (!(Pirates.pressedKeys.contains(e.getKeyCode())))
        Pirates.pressedKeys.add(e.getKeyCode());
    
}