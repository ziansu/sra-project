private void addText(java.awt.Graphics2D g2d, java.lang.String text, int x, int y, java.awt.Color color, int size) {
    g2d.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, size));
    g2d.setColor(color);
    g2d.drawString(text, (x * (se.liu.ida.henan076.tddd78.tetris.TetrisComponent.BLOCK_SIZE)), (y * (se.liu.ida.henan076.tddd78.tetris.TetrisComponent.BLOCK_SIZE)));
}