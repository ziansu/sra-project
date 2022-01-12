public void update() {
    yvel += gravity;
    if ((jumpDelay) > 0)
        (jumpDelay)--;
    
    if (((!(dead)) && ((requestJump) || (keyboard.isDown(java.awt.event.KeyEvent.VK_SPACE)))) && ((jumpDelay) <= 0)) {
        yvel = -10;
        jumpDelay = 10;
    }
    y += ((int) (yvel));
    requestJump = false;
}