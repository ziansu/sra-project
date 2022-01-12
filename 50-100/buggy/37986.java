@java.lang.Override
public void keyReleased(int keyCode) {
    if (!(alwaysMove)) {
        int x = speedVector.getDirection().x;
        int y = speedVector.getDirection().y;
        switch (keyCode) {
            case java.awt.event.KeyEvent.VK_RIGHT :
                x--;
                break;
            case java.awt.event.KeyEvent.VK_LEFT :
                x++;
                break;
            case java.awt.event.KeyEvent.VK_UP :
                y++;
                break;
            case java.awt.event.KeyEvent.VK_DOWN :
                y--;
                break;
            default :
                return ;
        }
        move(new java.awt.Point(x, y));
    }
}