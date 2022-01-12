public edu.cmu.cmulib.CoolMatrixUtility.core.Mat initL() {
    edu.cmu.cmulib.CoolMatrixUtility.core.Mat initL = new edu.cmu.cmulib.CoolMatrixUtility.core.Mat(src.rows, k);
    for (int j = 0; j < (k); j++) {
        for (int i = 0; i < (src.rows); i++) {
            initL.data[(((k) * (src.rows)) + i)] = java.lang.Math.random();
        }
    }
    edu.cmu.cmulib.CoolMatrixUtility.core.MatOp.vectorNormalize(initL, MatOp.NormType.NORM_L2);
    return initL;
}