@org.junit.Test
public void testBareissPivotWithValidSquareMatrixAndPivot() throws de.feu.algebra.computeralgebra.algorithm.AlgorithmFailedException {
    try {
        org.junit.Assert.assertEquals(0, det.bareissPivot(new de.feu.algebra.computeralgebra.matrix.Matrix(createValidMatrixForPivot())));
    } catch (final de.feu.algebra.computeralgebra.matrix.NoValidMatrixException e) {
        e.printStackTrace();
        org.junit.Assert.fail();
    } catch (final de.feu.algebra.computeralgebra.algorithm.AlgorithmFailedException e) {
        e.printStackTrace();
        org.junit.Assert.fail();
    }
}