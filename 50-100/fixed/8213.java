public void jump() {
    int x = getX();
    int y = getY();
    gravity();
    if (((ySpeed) == 0) && (checkCollision(x, (y + 2), Main.level.getConstructs()))) {
        ySpeed = -(environment.Constants.JUMP_HEIGHT);
    }
}