public void changeBoardValue(int x, int y, a8.battleship.Logic.BoardValues value) {
    java.util.ArrayList<a8.battleship.Logic.BoardValues> tempRow = board.get(y);
    tempRow.set(x, value);
    board.set(y, tempRow);
}