public java.lang.String moveToString(int move, int player) {
    java.lang.String moveOutput;
    int row;
    java.lang.String column;
    row = move / 10;
    column = nauertothelloproject.Board.COLUMNS[((move - 1) % 10)].toLowerCase();
    moveOutput = (column + " ") + row;
    return moveOutput;
}