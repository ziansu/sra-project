public void setCell(int row, int col, double val) {
    double tmp = table[row][col];
    table[row][col] = val;
    if ((isExcessiveVal(row, col)) && (isDuplicated(row, col)))
        table[row][col] = tmp;
    
}