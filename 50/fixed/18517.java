public com.labs.dm.sudoku.solver.core.IMatrix load(java.lang.String fileName) throws java.io.IOException {
    java.lang.String inputText = this.readFileAsString(fileName);
    int[] tab = this.convertToIntTable(this.toTable(inputText));
    return new com.labs.dm.sudoku.solver.core.Matrix(tab);
}