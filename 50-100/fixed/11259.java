private void saveImagePixels() {
    for (int xPixel = 0; xPixel < (this.width); ++xPixel) {
        for (int yPixel = 0; yPixel < (this.height); ++yPixel) {
            this.setPixel(xPixel, yPixel, imageArray[xPixel][yPixel].getColor());
        }
    }
}