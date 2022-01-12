public void reset(S newBoard) {
    java.awt.Graphics2D g = panel.getGraphics();
    state = newBoard.copy();
    renderBoard(g, newBoard);
}