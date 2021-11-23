@org.junit.Test
public void entriesAlongDiagonalOfDistanceMatrixShouldBeZero() throws java.lang.Exception {
    java.nio.file.Path directory = java.nio.file.Paths.get("resources/python/test_subset/");
    double[][] matrix = new TreeEditDistanceMatrix(directory, "python").compute();
    for (int i = 0; i < (matrix.length); i++) {
        assertArrayEquals(0, matrix[i][i], 0.001);
    }
}