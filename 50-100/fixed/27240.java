public static void adjustFont(org.gephi.preview.updaters.LabelFontAdjusterClient client) {
    java.awt.Font baseFont = client.getBaseFont();
    int newSize = java.lang.Math.round(((baseFont.getSize()) * (client.getSizeFactor())));
    if (newSize > 0) {
        java.awt.Font font = new java.awt.Font(baseFont.getName(), baseFont.getStyle(), newSize);
        client.setFont(font);
    }
}