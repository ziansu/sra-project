void update() {
    y += speedY;
    x += speedX;
    speedY += gravity;
    if ((y) >= 390) {
        speedY = 0;
        y = 390;
    }
    super.update();
}