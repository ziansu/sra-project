public void run() {
    if (fCurrentScale > 0.0F) {
        float preZoom = mapView.getZoomLevel(false);
        float newZoom = java.lang.Math.max(0.1F, ((float) (((java.lang.Math.log(fCurrentScale)) / (java.lang.Math.log(2.0))) + preZoom)));
        mapView.setAnimatedZoom(newZoom);
    }
    mapView.getController().onAnimationEnd();
    scaling = false;
}