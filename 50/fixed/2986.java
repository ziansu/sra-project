public void makeMove(int input) {
    insertIntoBoard(input);
    checkDraw();
    checkWinner();
}