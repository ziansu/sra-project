private static boolean colinear(Point... points) {
    double slope = points[0].slopeTo(points[1]);
    for (int i = 1; i < ((points.length) - 1); i++) {
        if ((java.lang.Math.abs(((points[i].slopeTo(points[(i + 1)])) - slope))) > 1.0E-5) {
            return false;
        }
    }
    return true;
}