public org.myrobotlab.opencv.OpenCVFilter addFilter(java.lang.String name, java.lang.String filterType) {
    org.myrobotlab.opencv.OpenCVFilter filter = videoProcessor.addFilter(name, filterType);
    return filter;
}