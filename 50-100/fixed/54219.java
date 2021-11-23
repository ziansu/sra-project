public boolean hit(int x, int y) {
    int dx = java.lang.Math.abs(((this.x1) - x));
    int dy = java.lang.Math.abs(((this.y1) - y));
    int space = dx | dy;
    return hit(space);
}