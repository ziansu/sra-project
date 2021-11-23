public void testGoodFeaturesToTrackMatListOfPointIntDoubleDoubleMatIntBooleanDouble() {
    org.opencv.core.Mat src = gray0;
    org.opencv.imgproc.Imgproc.rectangle(src, new org.opencv.core.Point(2, 2), new org.opencv.core.Point(8, 8), new org.opencv.core.Scalar(100), (-1));
    org.opencv.core.MatOfPoint lp = new org.opencv.core.MatOfPoint();
    org.opencv.imgproc.Imgproc.goodFeaturesToTrack(src, lp, 100, 0.01, 3, gray1, 4, true, 0);
    assertEquals(4, lp.total());
}