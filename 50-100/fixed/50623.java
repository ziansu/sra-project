private static boolean colinear(Point... points) {
    double slope = points[0].slopeTo(points[1]);
    for (int i = 1; i < ((points.length) - 1); i++) {
        if ((points[i].slopeTo(points[(i + 1)])) != slope) {
            return false;
        }
    }
    return true;
}