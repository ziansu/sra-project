public java.lang.Object getBackgroundImage(Point pt) {
    if (withinBounds(pt)) {
        return this.background.getCell(pt).getImage();
    }
    return null;
}