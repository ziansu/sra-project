@java.lang.Override
public void keyPressed(java.awt.event.KeyEvent event) {
    if (((event.getKeyCode()) == (java.awt.event.KeyEvent.VK_LEFT)) || ((event.getKeyCode()) == (java.awt.event.KeyEvent.VK_RIGHT)))
        playerCar.keyPressed(event);
    else
        textEntry.keyPressed(event);
    
}