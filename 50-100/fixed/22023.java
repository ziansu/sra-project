public void add(java.awt.Component comp, int w) {
    if (((x) >= (width)) || (((x) + w) > (width))) {
        x = 0;
        (y)++;
    }
    java.awt.Rectangle r = new java.awt.Rectangle(x, y, w, 1);
    parent.add(comp, new com.smartg.swing.layout.NodeConstraints(gridName, r));
    x += w;
}