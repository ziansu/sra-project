public void keysPressed(java.awt.event.KeyEvent k) {
    int keyCode = k.getKeyCode();
    if (keyCode == (java.awt.event.KeyEvent.VK_UP))
        isUp = true;
    
    if (keyCode == (java.awt.event.KeyEvent.VK_DOWN))
        isDown = true;
    
    if (keyCode == (java.awt.event.KeyEvent.VK_LEFT))
        isLeft = true;
    
    if (keyCode == (java.awt.event.KeyEvent.VK_RIGHT))
        isRight = true;
    
    if (keyCode == (java.awt.event.KeyEvent.VK_F)) {
        isHoldFire = true;
        if ((nowBulletPower) < 3.0) {
            nowBulletPower += 0.1;
        }
    }
}