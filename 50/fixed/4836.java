public void setBoard(main.BoardView b) {
    this.board = b;
    if (b != null) {
        this.rows = b.getHeight();
        this.cols = b.getWidth();
    }
    this.repaint();
}