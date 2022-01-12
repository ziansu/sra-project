public static org.opencv.core.Mat tresholdContrastBlackWhite(org.opencv.core.Mat image2, double d) {
    final org.opencv.core.Mat imageHSV = new org.opencv.core.Mat();
    org.opencv.imgproc.Imgproc.cvtColor(image2, imageHSV, Imgproc.COLOR_BGR2HSV);
    final org.opencv.core.Mat imageThresholded = new org.opencv.core.Mat();
    org.opencv.core.Core.inRange(imageHSV, new org.opencv.core.Scalar(160, 70, 169), new org.opencv.core.Scalar(179, 90, 179), imageThresholded);
    final org.opencv.core.Mat result = new org.opencv.core.Mat();
    imageThresholded.convertTo(result, CvType.CV_8UC3);
    return result;
}