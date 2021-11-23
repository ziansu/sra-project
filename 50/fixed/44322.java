public boolean checkValid(aiproj.hexifence.Move m) {
    if ((gameBoard[m.Row][m.Col]) == '+') {
        return true;
    }
    return false;
}