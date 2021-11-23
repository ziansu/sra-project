public java.awt.Image getImageByPosition(int x, int y) {
    if ((this.map.getElements(x, y)) != null)
        return this.map.getElements(x, y).getSprite().getImage();
    
    return null;
}