private void showHullAndCentroid(java.util.ArrayList<ij.ImagePlus> channels, Roi roi) {
    for (ij.ImagePlus channel : channels) {
        Overlay overlay = new Overlay();
        PointRoi pointRoi = new PointRoi(xCentroid, yCentroid);
        pointRoi.setPosition(roiPosition);
        overlay.add(pointRoi);
        roi.setPosition(roiPosition);
        overlay.add(roi);
        channel.setOverlay(overlay);
        channel.show();
    }
}