@org.junit.Test
public void testSetGridsize() {
    bigBrother.setGridsize(1337, 666);
    assertTrue(((bigBrother.survivalMatrix.length) == 666));
    assertTrue(((bigBrother.survivalMatrix[0].length) == 1337));
    bigBrother.setGridsize(1, 2);
    assertTrue(((bigBrother.survivalMatrix.length) == 666));
    assertTrue(((bigBrother.survivalMatrix[0].length) == 1337));
}