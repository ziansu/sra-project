public java.awt.Image getScaledInstance(int width, int height, int hints) {
    if ((bufferedImage) == null) {
        return null;
    }
    return bufferedImage.getScaledInstance(width, height, hints);
}