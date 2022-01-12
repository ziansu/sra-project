public static void printMatrix(int[][] matrix) {
    int rows = matrix.length;
    int columns = matrix[0].length;
    for (int i = 0; i <= (rows - 1); i++) {
        for (int j = 0; j <= (columns - 1); j++) {
            java.lang.System.out.print(((matrix[i][j]) + " "));
        }
        java.lang.System.out.println();
    }
    java.lang.System.out.println();
}