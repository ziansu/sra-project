public void handlePaddleCollision(ohs45.Paddle paddle) {
    if (this.intersects(paddle)) {
        velocityY = -(velocityY);
    }
}