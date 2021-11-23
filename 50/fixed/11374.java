public void flip() {
    if (!(isSinging)) {
        vx = -(vx);
        isFacingRight = (vx) > 0;
    }
}