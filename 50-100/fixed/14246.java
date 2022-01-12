public boolean diagOfSpecifiedRows(int grid, int row, int column) {
    if ((row == 2) || (column == 2)) {
        return helpForDiagOfSpecifiedRows(grid, row, column, (-2));
    }else
        if ((row == 0) || (column == 0)) {
            return helpForDiagOfSpecifiedRows(grid, row, column, 2);
        }
    
    return false;
}