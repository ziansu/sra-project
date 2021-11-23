public void setZoom(double z) {
    zoom = z;
    addResult(perspectives.two_d.ViewerContainer2D.EVENT_ANCHOR_ZOOM, z);
}