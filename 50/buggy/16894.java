private java.awt.Rectangle getGridBounds() {
    java.awt.Rectangle res = new java.awt.Rectangle();
    for (com.smartg.swing.layout.LayoutNode gl : this) {
        java.awt.Rectangle r = map.get(gl);
        res = res.union(r);
    }
    return res;
}