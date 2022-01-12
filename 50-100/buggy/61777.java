public void updateImage(int x, int y) {
    image.setRGB(x, y, java.awt.Color.GREEN.getRGB());
    if (((lastX) != (-1)) && ((lastY) != (-1)))
        image.setRGB(lastX, lastY, java.awt.Color.RED.getRGB());
    
    lastX = x;
    lastY = y;
    repaint();
}