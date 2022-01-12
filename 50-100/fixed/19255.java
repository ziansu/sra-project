public static boolean isOnRight(org.opencv.core.Point[] points) {
    if ((points[0].y) > (points[1].y)) {
        return (points[0].x) < (points[1].x);
    }
    return (points[0].x) > (points[1].x);
}