@java.lang.Override
protected void renderInternal(int x, int y, int width, int height, int[] image) {
    try {
        this.image.setRGB(x, y, width, height, image, 0, width);
    } catch (java.lang.ArrayIndexOutOfBoundsException ignored) {
    }
    repaint(x, y, width, height);
}