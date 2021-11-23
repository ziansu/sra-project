private void loadRGBValues() {
    pixelRGBValues = new int[height][width];
    for (int r = 0; r < (height); r++) {
        for (int c = 0; c < (width); c++) {
            pixelRGBValues[r][width] = image.getRGB(r, (((width) - c) - 1));
        }
    }
}