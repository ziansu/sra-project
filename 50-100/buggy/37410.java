@org.junit.Test
public void invert_1() {
    for (int i = 0; i < 10; i++) {
        org.ejml.data.CDenseMatrix64F A = org.ejml.ops.CRandomMatrices.createRandom(i, i, rand);
        org.ejml.data.CDenseMatrix64F A_orig = A.copy();
        org.ejml.data.CDenseMatrix64F I = org.ejml.ops.CRandomMatrices.createRandom(i, i, rand);
        org.ejml.ops.CCommonOps.invert(A);
        org.ejml.ops.CCommonOps.mult(A_orig, A, I);
        org.junit.Assert.assertTrue(org.ejml.ops.CMatrixFeatures.isIdentity(I, 1.0E-8));
    }
}