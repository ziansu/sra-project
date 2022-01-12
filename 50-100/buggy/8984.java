public boolean checkWin(boolean xTurn, int column) {
    boolean horizontal = (checkWinHorizontal(xTurn, column)) >= 4;
    boolean vertical = (checkWinVertical(xTurn, column)) >= 4;
    boolean diagonal = (checkWinDiagonal(xTurn, column)) >= 4;
    return (horizontal || vertical) || diagonal;
}