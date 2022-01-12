public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    g.setColor(java.awt.Color.yellow);
    g.fillRect(30, 200, 30, 30);
    for (clueGame.BoardCell[] i : layout) {
        for (clueGame.BoardCell j : i) {
            j.draw(g);
        }
    }
}