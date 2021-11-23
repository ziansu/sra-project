public void displayBoard() {
    board = new Board(this);
    this.getContentPane().removeAll();
    this.add(board);
    board.revalidate();
    board.repaint();
    this.revalidate();
    this.repaint();
    board.requestFocusInWindow();
}