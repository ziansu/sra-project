public void computeImageIntArray() {
    imageArray = new utils.image.RGBPixel[image.getWidth()][image.getHeight()];
    for (int xPixel = 0; xPixel < ((this.width) - 1); ++xPixel) {
        for (int yPixel = 0; yPixel < ((this.height) - 1); ++yPixel) {
            int color = image.getRGB(xPixel, yPixel);
            imageArray[xPixel][yPixel] = new utils.image.RGBPixel(color);
        }
    }
}