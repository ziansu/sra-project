public void setPixel(int x, int y, short red, short green, short blue) {
    image[y][x][0] = red;
    image[y][x][1] = green;
    image[y][x][2] = blue;
}