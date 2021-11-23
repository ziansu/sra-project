private void drawIndex(java.awt.Graphics g, int i, int rowLoc) {
    final java.lang.String memAddressDisplay = ("[" + (asHex(i))) + "]";
    drawValue(g, rowLoc, 0, memAddressDisplay);
}