public int extendedBareiss(final de.feu.algebra.computeralgebra.matrix.Matrix matrix) throws de.feu.algebra.computeralgebra.algorithm.AlgorithmFailedException {
    final int bound = (java.lang.Math.min(matrix.getColCount(), matrix.getRowCount())) - 1;
    for (int k = 0; k < bound; k++) {
        checkForZeroDivisorAndPivotColumn(matrix, k);
        calculateBareiss(matrix, bound, k);
    }
    return matrix.getCell(bound, bound);
}