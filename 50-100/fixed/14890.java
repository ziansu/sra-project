public void displayBoard() {
    this.getContentPane().removeAll();
    this.add(board);
    board.revalidate();
    board.repaint();
    this.revalidate();
    this.repaint();
    board.requestFocusInWindow();
}