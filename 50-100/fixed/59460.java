@java.lang.Override
public void keyPressed(java.awt.event.KeyEvent e) {
    switch (e.getKeyCode()) {
        case java.awt.event.KeyEvent.VK_UP :
            gameEngine.StartingClass.viewframe.setSpeedY((-(gameEngine.StartingClass.SCROLLSPEED)));
            break;
        case java.awt.event.KeyEvent.VK_DOWN :
            gameEngine.StartingClass.viewframe.setSpeedY(gameEngine.StartingClass.SCROLLSPEED);
            break;
        case java.awt.event.KeyEvent.VK_LEFT :
            gameEngine.StartingClass.viewframe.setSpeedX((-(gameEngine.StartingClass.SCROLLSPEED)));
            break;
        case java.awt.event.KeyEvent.VK_RIGHT :
            gameEngine.StartingClass.viewframe.setSpeedX(gameEngine.StartingClass.SCROLLSPEED);
            break;
        case java.awt.event.KeyEvent.VK_Z :
            break;
        case java.awt.event.KeyEvent.VK_X :
            break;
    }
}