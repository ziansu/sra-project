private void zoomLevelChanged() {
    double zoom = this.getZoomLevel();
    java.lang.String floatFormat = (zoom < 10) ? java.lang.String.format("%.2f", zoom) : java.lang.String.format("%.1f", zoom);
    zoomLabel.setText((floatFormat + "x"));
    helixImgGen.setZoomLevel(this.getZoomLevel());
    this.updateImage();
}