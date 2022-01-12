public int[] getCol(int col) {
    this.dim.check(1, col);
    int[] result = new int[this.dim.rows()];
    int i = 0;
    while (i < (this.dim.rows())) {
        result[i] = this.matrix[i][(col - 1)];
        i++;
    } 
    return result;
}