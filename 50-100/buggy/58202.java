public void makeRow(int boardsize, int color, java.util.ArrayList<java.lang.Integer> num) {
    if (num == null)
        return ;
    
    row = new java.util.ArrayList<java.lang.Integer>();
    for (int i = 0; i < boardsize; i++) {
        row.add(0);
    }
    for (int n : num) {
        row.set(n, color);
    }
    matrix.add(row);
}