public int bareiss(final de.feu.algebra.computeralgebra.matrix.Matrix matrix) throws de.feu.algebra.computeralgebra.algorithm.AlgorithmFailedException {
    final int colSize = (matrix.getColCount()) - 1;
    for (int k = 0; k < colSize; k++) {
        calculateBareiss(matrix, colSize, k);
    }
    return matrix.getCell(colSize, colSize);
}