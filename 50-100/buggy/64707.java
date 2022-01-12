private void drawEmphasisedValue(java.awt.Graphics g, int rowLoc, int colLoc, java.lang.String memValueDisplay) {
    g.setColor(java.awt.Color.BLACK);
    g.setFont(new java.awt.Font("Monospaced", java.awt.Font.BOLD, fontSize));
    drawValue(g, rowLoc, colLoc, memValueDisplay);
    g.setColor(java.awt.Color.GRAY);
    g.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, fontSize));
}