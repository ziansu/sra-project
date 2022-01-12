private boolean isTouching(int x, int y, int width, int height) {
    if (((this.X) >= x) && ((this.X) <= (x + width))) {
        if (((this.Y) >= y) && ((this.Y) <= (y + height))) {
            return true;
        }
    }
    return false;
}