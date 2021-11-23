private void saveImagePixels() {
    for (int xPixel = 0; xPixel < ((this.width) - 1); ++xPixel) {
        for (int yPixel = 0; yPixel < ((this.height) - 1); ++yPixel) {
            this.setPixel(xPixel, yPixel, imageArray[xPixel][yPixel].getColor());
        }
    }
}