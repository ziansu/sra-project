private void showHullAndCentroid(ij.ImagePlus src, Roi roi, boolean hide) {
    Overlay overlay = new Overlay();
    PointRoi pointRoi = new PointRoi(xCentroid, yCentroid);
    pointRoi.setPosition(roiPosition);
    overlay.add(pointRoi);
    roi.setPosition(roiPosition);
    overlay.add(roi);
    src.setOverlay(overlay);
    src.setHideOverlay(hide);
}