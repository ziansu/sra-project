public void update() {
    follow();
    centerX += speedX;
    speedX = ((bg.getSpeedX()) * 5) + (movementSpeed);
    r.setBounds(((centerX) - 25), ((centerY) - 25), 50, 60);
    if (r.intersects(Ninja.yellowRed)) {
        checkCollision();
    }
}