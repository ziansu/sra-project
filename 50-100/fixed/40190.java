public static void mapinit() {
    try {
        for (int x = 0; x < (map.cell[1]); x++) {
            for (int y = 0; y < (map.cell[0]); y++) {
                map.grid[x][y] = 0;
            }
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}