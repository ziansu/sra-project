public void move(float spdX) {
    x += spdX;
    y += speedY;
    if ((((y) + (r)) > (ball.height)) || (((y) - (r)) < 0)) {
        speedY *= -1.5;
    }
}