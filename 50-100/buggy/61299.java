public static double findLateralAngle(org.opencv.core.Point[] points) {
    double angle = java.lang.Math.toDegrees(java.lang.Math.asin(java.lang.Math.abs((((points[0].y) - (points[1].y)) / (Main.pointDist(points))))));
    return angle;
}