public void flip() {
    if (!(isSinging)) {
        vx = -(vx);
        isFacingRight = !(isFacingRight);
    }
}