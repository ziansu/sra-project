public java.awt.Color getBestAvailableColor() {
    java.awt.Color nextColor = java.awt.Color.gray;
    final java.util.ListIterator<org.diyefi.openlogviewer.coloring.MarkedColor> i = colorList.listIterator();
    for (boolean found = false; (i.hasNext()) && (!found);) {
        final org.diyefi.openlogviewer.coloring.MarkedColor c = i.next();
        if (c.isAvailable()) {
            c.setAvailability(false);
            nextColor = c.getColor();
            found = true;
        }
    }
    return nextColor;
}