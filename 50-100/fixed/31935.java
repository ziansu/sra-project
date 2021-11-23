public java.awt.image.BufferedImage getImage(java.lang.String fileName) {
    if (!(images.containsKey(fileName))) {
        images.put(fileName, micropolisj.gui.TileImages.loadImage(((("/" + (name)) + "/") + fileName)));
    }
    return images.get(fileName);
}