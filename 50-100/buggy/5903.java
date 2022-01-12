private void initUI() {
    this.setLayout(new java.awt.GridLayout(boardHeight, boardWidth));
    this.setComponentOrientation(java.awt.ComponentOrientation.LEFT_TO_RIGHT);
    for (int y = 0; y < (boardHeight); y++) {
        for (int x = 0; x < (boardWidth); x++) {
            this.add(board[(((boardWidth) - 1) - y)][x]);
        }
    }
    setFocusable(true);
}