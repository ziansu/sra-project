public int determineField(int col) {
    int row = (Model.Board.HEIGHT) - 1;
    while (row >= 0) {
        if ((getField(row, col)) == (Mark.XXX)) {
            break;
        }
        row--;
    } 
    return index(row, col);
}