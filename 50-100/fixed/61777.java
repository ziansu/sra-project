public void updateImage(int x, int y) {
    image.setRGB(y, x, java.awt.Color.GREEN.getRGB());
    if (((lastX) != (-1)) && ((lastY) != (-1)))
        image.setRGB(lastY, lastX, java.awt.Color.RED.getRGB());
    
    lastX = x;
    lastY = y;
    repaint();
}