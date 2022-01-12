private synchronized boolean validate(int x, int y) {
    boolean valid = false;
    if (((0 <= x) && ((this.width) > x)) && ((0 <= y) && ((this.height) > y))) {
        valid = true;
    }
    return valid;
}