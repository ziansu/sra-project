public weka.core.matrix.Matrix getU() {
    return new weka.core.matrix.Matrix(U, m, java.lang.Math.min(((m) + 1), n));
}