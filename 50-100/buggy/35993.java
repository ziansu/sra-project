public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    java.awt.Graphics2D g2d = ((java.awt.Graphics2D) (g));
    g2d.setRenderingHints(com.jjonsson.chess.gui.WindowUtilities.getRenderingHints());
    setBackground(java.awt.Color.darkGray);
    drawGrid(g2d);
    markSquaresAsAvailable();
}