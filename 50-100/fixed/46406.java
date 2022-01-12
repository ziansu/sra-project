private void getHSVROI() {
    ROIRect = null;
    maxBox = findMaxContourRect();
    if ((maxBox) != null) {
        ROIRect = maxBox.boundingRect();
        ROIRect = reshapeROIRect(ROIRect, Application.HandDetection.ROIRatio);
    }
    this.HSVRectROI = ROIRect;
}