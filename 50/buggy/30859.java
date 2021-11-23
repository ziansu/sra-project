public int getNbrCells() {
    java.lang.Integer w = _om.getInteger(getKey(_keyWidthCells));
    java.lang.Integer h = _om.getInteger(getKey(_keyHeightCells));
    return w * h;
}