public int manhattan() {
    int sum = 0;
    int position = 0;
    for (int block : blocks) {
        if (block != 0) {
            int correctPosition = block - 1;
            int diff = java.lang.Math.abs((position - correctPosition));
            int manhattan = (getRows(diff)) + (getCols(diff));
            sum += manhattan;
        }
        position++;
    }
    return sum;
}