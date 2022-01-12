private void drawBoard(java.awt.Graphics2D g2d) throws java.lang.InterruptedException {
    g2d.setColor(java.awt.Color.black);
    g2d.fillRect(0, 0, Minotaur.JavaFiles.Grid.dim.width, Minotaur.JavaFiles.Grid.dim.height);
    drawMap(g2d);
    playGame(g2d);
    java.awt.Toolkit.getDefaultToolkit().sync();
    g2d.dispose();
}