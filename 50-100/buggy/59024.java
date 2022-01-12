private int getMaxNameDrawnWidth(org.apache.batik.svggen.SVGGraphics2D graphics, java.util.List<java.lang.Integer> items) {
    java.awt.FontMetrics metrics = pl.poznan.put.utility.svg.SVGHelper.getFontMetrics(graphics);
    int maxWidth = java.lang.Integer.MIN_VALUE;
    for (int i = 0; i < (items.size()); i++) {
        int item = items.get(i);
        java.lang.String name = names.get(item);
        int width = metrics.stringWidth(name);
        if (width > maxWidth) {
            maxWidth = width;
        }
    }
    return maxWidth;
}