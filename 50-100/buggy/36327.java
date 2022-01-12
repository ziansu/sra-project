public static android.graphics.Bitmap getLimeStutterBitmap(android.graphics.Bitmap mOriginalBmp, int width, int height) {
    com.holenstudio.excamera2.util.BezierSpline.Point[] blueKnots;
    blueKnots = new com.holenstudio.excamera2.util.BezierSpline.Point[3];
    blueKnots[0] = new com.holenstudio.excamera2.util.BezierSpline.Point(0, 0);
    blueKnots[1] = new com.holenstudio.excamera2.util.BezierSpline.Point(165, 114);
    blueKnots[2] = new com.holenstudio.excamera2.util.BezierSpline.Point(255, 255);
    return com.holenstudio.excamera2.util.ImageProcessUtil.process(mOriginalBmp, null, null, null, blueKnots);
}