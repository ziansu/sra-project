public void updateFrame(int[] frameArray) {
    for (int i = 0; i < (frameArray.length); i++) {
        screenImage.setRGB((i % 256), (i / 256), frameArray[i]);
    }
    repaint();
}