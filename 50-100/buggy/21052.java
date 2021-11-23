public static void main(java.lang.String[] args) {
    int boardWidth = 20;
    int boardHeight = 30;
    se.liu.ida.erihe763.tddd78.tetris.Board b1 = new se.liu.ida.erihe763.tddd78.tetris.Board(boardWidth, boardHeight);
    se.liu.ida.erihe763.tddd78.tetris.TetrisFrame frame = new se.liu.ida.erihe763.tddd78.tetris.TetrisFrame(b1);
    frame.pack();
    frame.setVisible(true);
    while (true) {
        b1.updateBoard();
    } 
}