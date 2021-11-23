public void setTolerance(int hue, int sat, int val) {
    if ((mFloodDetector) != null) {
        mFloodDetector.setColorRadius(hue, sat, val);
    }
}