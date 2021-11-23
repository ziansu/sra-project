public int[] getRow(int row) {
    int[] rowElements = new int[9];
    for (int i = 0; i < 9; i++)
        rowElements[i] = board[0][i];
    
    return rowElements;
}