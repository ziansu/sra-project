public int findEmptyNumber() {
    int count = 0;
    for (int c = 0; c < (gridSize); c++) {
        for (int r = 0; r < (gridSize); r++)
            if ((board[c][r]) == 0) {
                array[count][0] = c;
                array[count][1] = r;
                count++;
            }
        
    }
    return count;
}