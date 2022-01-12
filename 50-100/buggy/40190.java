public static void mapinit() {
    try {
        for (int x = 0; x < (map.cell[0]); x++) {
            for (int y = 0; y < (map.cell[1]); y++) {
                map.grid[x][y] = 0;
            }
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}