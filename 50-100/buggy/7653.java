private void showHullAndCentroid(java.util.ArrayList<ij.ImagePlus> channels, Roi roi) {
    for (ij.ImagePlus channel : channels) {
        Overlay overlay = new Overlay();
        PointRoi pointRoi = new PointRoi(xCentroid, yCentroid);
        pointRoi.setPosition(roiPosition);
        overlay.add(pointRoi);
        PolygonRoi convexHull = new PolygonRoi(roi.getConvexHull(), Roi.POLYGON);
        convexHull.setPosition(roiPosition);
        overlay.add(convexHull);
        channel.setOverlay(overlay);
        channel.show();
    }
}