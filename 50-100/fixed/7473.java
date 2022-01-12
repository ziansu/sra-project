private int getManhattan(int row, int col, int point) {
    if (point == 0)
        return 0;
    
    int rowP = point / (dim);
    int colP = (point - (rowP * (dim))) - 1;
    return (java.lang.Math.abs((row - rowP))) + (java.lang.Math.abs((col - colP)));
}