public void changeBoardValue(int x, int y, a8.battleship.Logic.BoardValues value) {
    java.util.ArrayList<a8.battleship.Logic.BoardValues> tempRow = board.get(x);
    tempRow.set(y, value);
    board.set(x, tempRow);
}