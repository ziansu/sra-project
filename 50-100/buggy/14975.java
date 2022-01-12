public static int[][] getLockerDistanceGrid(int cityLength, int cityWidth, int[] X, int[] Y) {
    int[][] grid = new int[cityLength][cityWidth];
    for (int r = 0; r < cityLength; r++) {
        for (int c = 0; c < cityWidth; c++) {
            grid[r][c] = array.lockerLocations.LockerLocations.distance(r, c, X, Y);
        }
    }
    return grid;
}