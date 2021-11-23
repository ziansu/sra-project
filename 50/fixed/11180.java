@java.lang.Override
protected void pulseProcessor() {
    checkApple(false);
    checkCollision();
    move();
}