@java.lang.Override
public org.easypr.core.Mat getHistogramFeatures(org.easypr.core.Mat image) {
    org.easypr.core.Mat grayImage = new org.easypr.core.Mat();
    cvtColor(image, grayImage, org.easypr.core.CV_RGB2GRAY);
    image = grayImage;
    grayImage = null;
    java.lang.System.gc();
    org.easypr.core.Mat img_threshold = new org.easypr.core.Mat();
    threshold(image, img_threshold, 0, 255, ((CV_THRESH_OTSU) + (CV_THRESH_BINARY)));
    image = img_threshold;
    img_threshold = null;
    java.lang.System.gc();
    image = getTheFeatures(image);
    java.lang.System.gc();
    return image;
}