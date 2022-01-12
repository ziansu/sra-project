private void loadRGBValues() {
    pixelRGBValues = new int[height][width];
    for (int r = 0; r < (height); r++) {
        for (int c = 0; c < (width); c++) {
            pixelRGBValues[r][c] = image.getRGB(c, (((height) - r) - 1));
        }
    }
}