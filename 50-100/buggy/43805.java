public void setPixel(int x, int y, short red, short green, short blue) {
    image[x][y][0] = red;
    image[x][y][1] = green;
    image[x][y][2] = blue;
}