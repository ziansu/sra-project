public static double getDistance(Node a, Node b) {
    double d_x = (a.x) - (b.x);
    d_x *= d_x;
    double d_y = (a.y) - (b.y);
    d_y *= d_y;
    return java.lang.Math.sqrt((d_x + d_y));
}