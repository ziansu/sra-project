private void randomChecks(org.ejml.sparse.csc.decomposition.qr.TestQrStructuralCountsDSCC.Check check) {
    for (int mc = 0; mc < 100; mc++) {
        int numCols = (rand.nextInt(10)) + 1;
        int numRows = (rand.nextInt(10)) + 1;
        int nz = org.ejml.sparse.csc.RandomMatrices_DSCC.nonzero(numRows, numCols, 0.01, 0.5, rand);
        org.ejml.data.DMatrixSparseCSC A = org.ejml.sparse.csc.RandomMatrices_DSCC.rectangle(numRows, numCols, nz, rand);
        check.check(A);
    }
}