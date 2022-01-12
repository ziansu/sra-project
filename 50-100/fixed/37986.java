@java.lang.Override
public void keyReleased(int keyCode) {
    if (!(alwaysMove)) {
        int x = speedVector.getDirection().x;
        int y = speedVector.getDirection().y;
        switch (keyCode) {
            case java.awt.event.KeyEvent.VK_RIGHT :
            case java.awt.event.KeyEvent.VK_LEFT :
                x = 0;
                break;
            case java.awt.event.KeyEvent.VK_UP :
            case java.awt.event.KeyEvent.VK_DOWN :
                y = 0;
                break;
            default :
                return ;
        }
        move(new java.awt.Point(x, y));
    }
}