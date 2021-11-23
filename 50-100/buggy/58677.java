public java.awt.Image getImageByPosition(int x, int y) {
    if ((this.map.getElements((-1), (-1))) != null)
        return this.map.getElements(x, y).getSprite().getImage();
    
    return null;
}