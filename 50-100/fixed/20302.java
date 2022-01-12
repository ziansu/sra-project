private float convertRGBToGrayscale(final int rgbColor) {
    int red = (rgbColor >> 16) & 255;
    int green = (rgbColor >> 8) & 255;
    int blue = rgbColor & 255;
    return ((0.3F * red) + (0.59F * green)) + (0.11F * blue);
}