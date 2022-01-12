public java.awt.image.BufferedImage getImage(java.lang.String fileName) {
    if (!(images.containsKey(name))) {
        images.put(name, micropolisj.gui.TileImages.loadImage(((("/" + (name)) + "/") + fileName)));
    }
    return images.get(name);
}