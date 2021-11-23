public void keyPressed(java.awt.event.KeyEvent e) {
    int keyCode = e.getKeyCode();
    directions.add("D");
    switch (keyCode) {
        case java.awt.event.KeyEvent.VK_UP :
            directions.add("U");
            java.lang.System.out.println("UP");
            break;
        case java.awt.event.KeyEvent.VK_DOWN :
            directions.add("D");
            java.lang.System.out.println("DOWN");
            break;
        case java.awt.event.KeyEvent.VK_LEFT :
            directions.add("L");
            java.lang.System.out.println("LEFT");
            break;
        case java.awt.event.KeyEvent.VK_RIGHT :
            directions.add("R");
            java.lang.System.out.println("RIGHT");
            break;
    }
}