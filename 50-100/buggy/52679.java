@com.oracle.truffle.api.dsl.Specialization(guards = { "isMatrix(x)" , "isMatrix(y)" })
protected com.oracle.truffle.r.runtime.data.RDoubleVector crossprod(com.oracle.truffle.r.runtime.data.model.RAbstractDoubleVector x, com.oracle.truffle.r.runtime.data.model.RAbstractDoubleVector y) {
    ensureMatMult();
    int xRows = x.getDimensions()[0];
    int xCols = x.getDimensions()[1];
    int yRows = y.getDimensions()[0];
    int yCols = y.getDimensions()[1];
    return matMult.doubleMatrixMultiply(x, y, xCols, xRows, yRows, yCols, xRows, 1, 1, yRows, false);
}