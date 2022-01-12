public boolean addRectangle(int x, int y, int w, int h) {
    java.awt.Rectangle tmpRect = new java.awt.Rectangle(x, y, w, h);
    if (canAddRectangle(tmpRect)) {
        this.rects.add(tmpRect);
        updateEdgeList(tmpRect);
        return true;
    }
    return false;
}