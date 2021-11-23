public void playChar(char c, int x, int y) {
    squares[y][x].setText(("" + c));
    squares[y][x].removeActionListener(bh);
}