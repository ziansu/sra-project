@java.lang.Override
public java.lang.String decorMatrix(int[][] matrix) {
    java.lang.StringBuilder array = new java.lang.StringBuilder("");
    for (int i = 0; i <= ((matrix.length) - 1); i++) {
        array.append(((this.arrayToString(matrix[i])) + (java.lang.System.lineSeparator())));
    }
    return java.lang.String.format(primitivesMatrixTemplate, array);
}