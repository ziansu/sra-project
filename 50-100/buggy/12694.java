@java.lang.Override
public void handle(javafx.scene.input.MouseEvent e) {
    if (!(isGameover)) {
        int row = GUI.getLoc(((int) ((e.getY()) - 48)));
        int col = GUI.getLoc(((int) (e.getX())));
        board.addPiece(row, col);
        update();
        if (board.checkWin()) {
            isGameover = true;
            endGame();
        }
    }
}