public calculator.Matrix scalarMultiply(int a_scalar, calculator.Matrix a_matrix) {
    calculator.Matrix scalarMatrix = new calculator.Matrix(a_matrix);
    for (int row = 0; row < (a_matrix.getRows()); row++) {
        for (int column = 0; column < (a_matrix.getColumns()); column++) {
            calculator.Fraction current = scalarMatrix.getCell(row, column);
            scalarMatrix.setCell(row, column, current.multiply(a_scalar));
        }
    }
    return scalarMatrix;
}