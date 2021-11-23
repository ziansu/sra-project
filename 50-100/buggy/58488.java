private static java.util.List<org.opencv.core.Rect> findRectsInRect(java.util.List<org.opencv.core.Rect> rects, org.opencv.core.Rect rect) {
    java.util.List<org.opencv.core.Rect> output = new java.util.ArrayList<org.opencv.core.Rect>();
    for (org.opencv.core.Rect r : rects) {
        if ((rect.contains(r.br())) || (rect.contains(r.tl()))) {
            output.add(r);
        }
    }
    return output;
}