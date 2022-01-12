public static void adjustFont(org.gephi.preview.updaters.LabelFontAdjusterClient client) {
    java.awt.Font baseFont = client.getBaseFont();
    int newSize = ((int) ((baseFont.getSize()) * (client.getSizeFactor())));
    java.awt.Font font = new java.awt.Font(baseFont.getName(), baseFont.getStyle(), newSize);
    client.setFont(font);
}