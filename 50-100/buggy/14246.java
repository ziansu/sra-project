public boolean helpForDiagOfSpecifiedRows(int grid, int row, int column) {
    if ((row == 2) || (column == 2)) {
        return diagOfSpecifiedRows(grid, row, column, (-2));
    }else
        if ((row == 0) || (column == 0)) {
            return diagOfSpecifiedRows(grid, row, column, 2);
        }
    
    return false;
}