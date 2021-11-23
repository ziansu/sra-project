public boolean checkWin(GameLogic.Slot slot) {
    boolean win = false;
    win = ((checkHorizontal(slot)) || (checkVertical(slot))) || (checkDiagonal(slot));
    return win;
}