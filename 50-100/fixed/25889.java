private java.util.ArrayList<java.lang.Integer> getFliesFromTile(int row_index, int col_index) {
    if ((((row_index < 0) || (col_index < 0)) || (col_index >= (cols))) || (row_index >= (rows))) {
        return new java.util.ArrayList<java.lang.Integer>();
    }else {
        return flyGrid.get(row_index).get(col_index);
    }
}