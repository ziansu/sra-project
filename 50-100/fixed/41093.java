public boolean makeMove(boolean whitePlayer, int startSquare, int endSquare, int arrowSquare) {
    if ((validateMove(whitePlayer, startSquare, endSquare, arrowSquare)) == true) {
        addAmazon(whitePlayer, endSquare);
        board[startSquare] = gameBoard.Board.EMPTY;
        board[arrowSquare] = gameBoard.Board.ARROW;
        return true;
    }else {
        return false;
    }
}