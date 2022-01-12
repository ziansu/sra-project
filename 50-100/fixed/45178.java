private static double getLandingHeight(int[][] futureFields, int firstCol, int length, int rowsCleared) {
    int height = 0;
    for (int i = firstCol; i < (firstCol + length); i++) {
        if (height < (Heuristic.heights[i])) {
            height = Heuristic.heights[i];
        }
    }
    height -= rowsCleared;
    return height;
}