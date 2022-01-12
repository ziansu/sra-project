public static double getDistance(Node a, Node b) {
    double d_x = (a.getX()) - (b.getX());
    d_x *= d_x;
    double d_y = (a.getY()) - (b.getY());
    d_y *= d_y;
    return java.lang.Math.sqrt((d_x + d_y));
}