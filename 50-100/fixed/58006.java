private java.lang.String descendingdiagonalline() {
    java.lang.StringBuilder diagonal = new java.lang.StringBuilder(width);
    for (int i = 0; i < (width); i++) {
        int j = ((prevcol) - (prevrow)) + i;
        if ((j >= 0) && (j < (length))) {
            diagonal.append(board[i][j]);
        }
    }
    return diagonal.toString();
}