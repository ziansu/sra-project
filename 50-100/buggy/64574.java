protected void computeStatsFillModel(hex.pca.PCAModel pca, hex.svd.SVDModel svd) {
    pca._output._normSub = svd._output._normSub;
    pca._output._normMul = svd._output._normMul;
    pca._output._permutation = svd._output._permutation;
    pca._output._nnums = svd._output._nnums;
    pca._output._ncats = svd._output._ncats;
    pca._output._catOffsets = svd._output._catOffsets;
    pca._output._nobs = svd._output._nobs;
    pca._output._std_deviation = hex.pca.ArrayUtils.mult(svd._output._d, (1.0 / (java.lang.Math.sqrt(((svd._output._nobs) - 1.0)))));
    pca._output._eigenvectors_raw = svd._output._v;
    pca._output._total_variance = svd._output._total_variance;
    buildTables(pca, svd._output._names_expanded);
}