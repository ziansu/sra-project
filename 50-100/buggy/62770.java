@java.lang.Override
public org.ejml.data.DMatrixSparseCSC getRowPivot(org.ejml.data.DMatrixSparseCSC pivot) {
    if (pivot == null)
        pivot = new org.ejml.data.DMatrixSparseCSC(L.numRows, L.numRows, 0);
    
    pivot.reshape(L.numRows, L.numRows, L.numRows);
    org.ejml.sparse.csc.CommonOps_DSCC.permutationMatrix(pinv, false, L.numRows, pivot);
    return pivot;
}