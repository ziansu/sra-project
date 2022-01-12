public boolean isInvertable() throws de.phip1611.matrices.Matrix.NonQuadraticMatrixException, javax.naming.OperationNotSupportedException {
    if (!(this.isSquareMatrix()))
        return false;
    
    if ((this.det()) != 0) {
        return true;
    }
    return false;
}