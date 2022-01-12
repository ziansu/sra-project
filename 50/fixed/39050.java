public boolean checkWin(GameLogic.Slot slot) {
    boolean win;
    win = ((checkHorizontal(slot)) || (checkVertical(slot))) || (checkDiagonal(slot));
    return win;
}