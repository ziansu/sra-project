public java.lang.String spawnEast(int offX, int offY, int width) {
    java.awt.Graphics2D e2d = backImage.createGraphics();
    e2d.drawImage(this.getEast(), offX, offY, width, this.getEast().getHeight(), null);
    java.lang.String name = updateGeneratedImage();
    return name;
}