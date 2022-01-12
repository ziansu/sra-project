public void update(board.Grid grid) {
    if ((active) == true) {
        if ((grid.clicked) != null) {
            move = grid.clicked.col;
            movemade = true;
        }
    }
}