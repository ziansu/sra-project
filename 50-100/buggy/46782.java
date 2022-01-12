public static boolean ok(int x, int y, int xs, int ys, boolean wx, boolean wy) {
    int a = (wx) ? 1 : 0;
    int b = (wy) ? 1 : 0;
    return (((x >= (-a)) && (x < (xs + a))) && (y >= (-a))) && (y < (ys + a));
}