public int[] searchElement(int element) {
    for (int i = 0; i < (matrix.length); i++) {
        for (int j = 0; j < (matrix[i].length); j++) {
            if (element == (matrix[i][j])) {
                return new int[]{ i , j };
            }
        }
    }
    return null;
}