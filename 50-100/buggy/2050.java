public org.apache.commons.math3.util.Pair<java.lang.Integer, java.lang.Double> calculateLargestContour(java.util.ArrayList<org.weasis.dicom.rt.Contour> planeContours) {
    double maxContourArea = 0.0;
    int maxContourIndex = 0;
    for (int i = 0; i < (planeContours.size()); i++) {
        org.weasis.dicom.rt.Contour polygon = planeContours.get(i);
        if ((polygon.getArea()) > maxContourArea) {
            maxContourArea = polygon.getArea();
            maxContourIndex = i;
        }
    }
    return new org.apache.commons.math3.util.Pair(maxContourIndex, maxContourArea);
}