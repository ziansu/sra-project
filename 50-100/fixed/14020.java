public void setValueAt(java.lang.Object value, int row, int col) {
    if (((((-1) < row) && (row < (this.rows))) && ((-1) < col)) && (col < (this.cols))) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }
}