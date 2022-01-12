public int maximalSquare(char[][] matrix) {
    if ((matrix.length) == 0)
        return 0;
    
    int pow = 1;
    for (int i = 0; i < (matrix.length); i++) {
        for (int k = 0; k < (matrix[0].length); k++) {
            while (dfs(matrix, i, k, pow)) {
                pow++;
            } 
        }
    }
    --pow;
    return pow * pow;
}