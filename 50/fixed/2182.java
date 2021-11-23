public void playChar(char c, int x, int y) {
    squares[x][y].setText(("" + c));
    squares[x][y].removeActionListener(bh);
}