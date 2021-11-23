private int FindMaxContour(java.util.ArrayList<org.opencv.core.MatOfPoint> contours) {
    int i;
    int idx_max_contour = -1;
    double size_max_contour = 0.0;
    for (i = 0; i < (contours.size()); i++) {
        if ((contours.get(i).size().area()) > size_max_contour) {
            size_max_contour = contours.get(i).size().area();
            idx_max_contour = i;
        }
    }
    return idx_max_contour;
}