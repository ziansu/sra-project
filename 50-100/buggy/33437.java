@org.junit.Test
public void testGetRowDim() {
    java.util.Random rand = new java.util.Random();
    int numRows = (rand.nextInt(10)) + 0;
    int numCols = (rand.nextInt(10)) + 0;
    javatrix.Matrix matrix = new javatrix.Matrix(numRows, numCols);
    org.junit.Assert.assertEquals(numRows, matrix.getRowDimension());
}