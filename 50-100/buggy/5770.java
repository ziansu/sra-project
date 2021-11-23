private math.geom2d.circulinear.PolyCirculinearCurve2D<math.geom2d.circulinear.CirculinearElement2D> cleanup_contour(java.util.LinkedList<org.roiderh.gcodeviewer.contourelement> contour) {
    math.geom2d.circulinear.PolyCirculinearCurve2D<math.geom2d.circulinear.CirculinearElement2D> elements = new math.geom2d.circulinear.PolyCirculinearCurve2D();
    for (org.roiderh.gcodeviewer.contourelement current_ce : contour) {
        if ((current_ce.curve) == null) {
            continue;
        }
        if ((current_ce.curve.length()) == 0) {
        }
        elements.add(current_ce.curve);
        if ((current_ce.transition_curve) != null) {
            elements.add(current_ce.transition_curve);
        }
    }
    return elements;
}