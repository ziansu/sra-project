public static int[][] getLockerDistanceGrid(int cityLength, int cityWidth, int[] X, int[] Y) {
    int[][] grid = new int[cityWidth][cityLength];
    for (int r = 0; r < cityWidth; r++) {
        for (int c = 0; c < cityLength; c++) {
            grid[r][c] = array.lockerLocations.LockerLocations.distance(r, c, X, Y);
        }
    }
    return grid;
}