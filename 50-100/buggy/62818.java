private boolean checkVertical(int row, int col) {
    if (row <= ((board[0].length) - 3)) {
        if (((board[row][col]) == (board[(row + 1)][col])) && ((board[row][col]) == (board[(row + 2)][col]))) {
            java.lang.System.out.println("There is a win there");
            return true;
        }
    }
    return false;
}