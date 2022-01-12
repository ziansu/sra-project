public void set(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    viewportClipping = !((((x == 1) && (y == (-1))) && (width == 2)) && (height == (-2)));
}