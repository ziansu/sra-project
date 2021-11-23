@java.lang.Override
public void clickCell(minesweeper.Location c) {
    if (mineField.clickCell(c)) {
        gameLose();
    }
    if (fieldIsClear()) {
        gameWin();
    }
}