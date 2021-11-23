public void jump(int delta) {
    double jumpSpeed = 2;
    double fallSpeed = (thisJumpHeight) / 60;
    (thisJumpHeight)++;
    if (jumping) {
        y = ((float) (y)) - ((float) ((jumpSpeed * (0.35 - fallSpeed)) * delta));
    }
    if (hitBelow) {
        thisJumpHeight = 0.0;
        setJumping(false);
    }
}