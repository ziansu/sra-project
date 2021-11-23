public void setPixel(int x, int y, short red, short green, short blue) {
    if ((((red >= 0) && (red <= 255)) && ((green >= 0) && (red <= 255))) && ((blue >= 0) && (red <= 255))) {
        PixImage.pixel currentpixel = RGB[x][y];
        currentpixel.R = red;
        currentpixel.G = green;
        currentpixel.B = blue;
    }
}