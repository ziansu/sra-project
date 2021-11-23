public void keyPressed(java.awt.event.KeyEvent e) {
    int keyCode = e.getKeyCode();
    switch (keyCode) {
        case java.awt.event.KeyEvent.VK_UP :
            directions.add("U");
            break;
        case java.awt.event.KeyEvent.VK_DOWN :
            directions.add("D");
            break;
        case java.awt.event.KeyEvent.VK_LEFT :
            directions.add("L");
            break;
        case java.awt.event.KeyEvent.VK_RIGHT :
            directions.add("R");
            break;
    }
}