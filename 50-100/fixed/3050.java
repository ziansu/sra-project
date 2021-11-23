private static int getTotalWeight(int[][] matrix) {
    int weight = 0;
    for (int x = 0; x < (matrix.length); x++) {
        YAxis : for (int y = x + 1; y < (matrix.length); y++) {
            int w = matrix[x][y];
            if (w == (-1))
                continue YAxis;
            
            weight = weight + w;
        }
    }
    return weight;
}