public algorithm.Matrix<T> multiply(algorithm.Matrix<T> multiplier, algorithm.Matrix<T> result) {
    for (int cRow = 0; cRow < (this.getRows()); ++cRow) {
        for (int cCol = 0; cCol < (multiplier.getColumns()); ++cCol) {
            T resultCell = vectorProduct(this.getRow(cRow), multiplier.getColumn(cCol));
            result.setCell(cRow, cCol, resultCell);
        }
    }
    return result;
}