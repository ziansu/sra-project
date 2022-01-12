private void drawIndex(java.awt.Graphics g, int i, int rowLoc) {
    final java.lang.String memAddressDisplay = ("[" + (asHex(i))) + "]";
    drawValue(g, 0, rowLoc, memAddressDisplay);
}