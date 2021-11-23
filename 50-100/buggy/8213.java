public void jump() {
    int x = getSprite().getX();
    int y = getSprite().getY();
    gravity();
    if (((ySpeed) == 0) && (checkCollision(x, (y + 2), Main.level.getConstructs()))) {
        ySpeed = -(environment.Constants.JUMP_HEIGHT);
    }
}