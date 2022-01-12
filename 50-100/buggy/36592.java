public void updateFrame(int[] frameArray) {
    for (int i = 0; i < (frameArray.length); i++) {
        screenImage.setRGB((i % 256), (i / 256), com.bibler.awesome.bibnes.utils.NESPalette.getPixel(frameArray[i]));
    }
    repaint();
}