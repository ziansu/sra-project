private boolean isTouching(int x, int y, int width, int height) {
    if (((this.X) >= x) && ((this.X) <= (x + width))) {
        if (((this.Y) >= y) && ((this.X) <= (y + height))) {
            java.lang.System.out.println("touching gold");
            return true;
        }
    }
    return false;
}