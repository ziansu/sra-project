public void update() {
    if ((isMovingRight()) || (isMovingLeft())) {
        centerX += speedX;
    }
    if (isJumped()) {
        centerY += speedY;
        speedY += 4;
    }
    if ((centerY) >= (jumpStartY)) {
        jumped = false;
        speedY = 0;
    }
}