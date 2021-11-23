public static void createHTunnel(byte[][] map, int x1, int x2, int y) {
    for (int x = java.lang.Math.min(x1, x2); x < (java.lang.Math.max(x1, x2)); x++) {
        map[y][x] = ((byte) (dungeon.MapGenDungeon.SPACE));
    }
}