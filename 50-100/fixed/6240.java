@java.lang.Override
public org.easypr.core.Mat getHistogramFeatures(org.easypr.core.Mat image) {
    org.easypr.core.Mat grayImage = new org.easypr.core.Mat();
    cvtColor(image, grayImage, org.easypr.core.CV_RGB2GRAY);
    org.easypr.core.Mat img_threshold = new org.easypr.core.Mat();
    threshold(grayImage, img_threshold, 0, 255, ((CV_THRESH_OTSU) + (CV_THRESH_BINARY)));
    return getTheFeatures(img_threshold);
}