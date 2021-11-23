public static boolean isInGrid(java.awt.Point point) {
    return ((((point.x) >= 0) && ((point.x) < 9)) && ((point.y) >= 0)) && ((point.y) < 9);
}