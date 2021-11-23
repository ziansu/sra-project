@java.lang.Override
public void keyPressed(int keyCode) {
    int x = speedVector.getDirection().x;
    int y = speedVector.getDirection().y;
    switch (keyCode) {
        case java.awt.event.KeyEvent.VK_RIGHT :
            x = 1;
            break;
        case java.awt.event.KeyEvent.VK_LEFT :
            x = -1;
            break;
        case java.awt.event.KeyEvent.VK_UP :
            y = -1;
            break;
        case java.awt.event.KeyEvent.VK_DOWN :
            y = 1;
            break;
        default :
            return ;
    }
    move(new java.awt.Point(x, y));
}