public static java.util.List<org.xmlcml.graphics.svg.SVGPolyline> findLShapes(java.util.List<org.xmlcml.graphics.svg.SVGPolyline> polylines) {
    java.util.List<org.xmlcml.graphics.svg.SVGPolyline> polylineList = new java.util.ArrayList<org.xmlcml.graphics.svg.SVGPolyline>();
    for (org.xmlcml.graphics.svg.SVGPolyline polyline : polylines) {
        if (polyline.isLShape()) {
            polylineList.add(polyline);
        }else {
            polyline.reverse();
            if (polyline.isLShape()) {
                polylineList.add(polyline);
            }
        }
    }
    return polylineList;
}