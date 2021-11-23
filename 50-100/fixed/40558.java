public void setLut(java.util.List<java.awt.Color> colors) {
    int i = 0;
    for (java.awt.Color color : colors) {
        red[i] = ((byte) (color.getRed()));
        green[i] = ((byte) (color.getGreen()));
        blue[i] = ((byte) (color.getBlue()));
        i++;
    }
    overlayLUT = new ij.process.LUT(red, green, blue);
}