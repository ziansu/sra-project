public void update() {
    if ((isMovingRight()) || (isMovingLeft())) {
        centerX += speedX;
    }
    if (jumped) {
        centerY += speedY;
        speedY += 4;
    }
    if ((centerY) >= (jumpStartY)) {
        jumped = false;
        speedY = 0;
    }
}