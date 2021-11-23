public static double manhattanDist(Node start, Node end) {
    int xdist = java.lang.Math.abs(((start.x) - (end.x)));
    int ydist = java.lang.Math.abs(((start.y) - (end.y)));
    return ((xdist + ydist) / 4) - (1.41421356237 * (java.lang.Math.min(xdist, ydist)));
}