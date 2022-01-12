private int getRowDif(int number, int pos) {
    int result = ((number - 1) / (N)) - (pos / (N));
    return result > 0 ? result : -result;
}