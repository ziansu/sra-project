private void showHullAndCentroid(ij.ImagePlus src, Roi roi, boolean hide) {
    Overlay overlay = new Overlay();
    PointRoi pointRoi = new PointRoi(xCentroid, yCentroid);
    pointRoi.setPosition(roiPosition);
    overlay.add(pointRoi);
    PolygonRoi convexHull = new PolygonRoi(roi.getConvexHull(), Roi.POLYGON);
    convexHull.setPosition(roiPosition);
    overlay.add(convexHull);
    src.setOverlay(overlay);
    src.setHideOverlay(hide);
}