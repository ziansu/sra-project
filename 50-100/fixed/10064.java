@java.lang.Override
public int getCurrentZoom() {
    try {
        java.lang.String zoomRes = sendRequest(buildPanTiltHeadControlURL("%23GZ"));
        if (zoomRes.startsWith("gz")) {
            int zoom = java.lang.Integer.parseInt(zoomRes.substring(2, 5), 16);
            lastKnown.setZoom(zoom);
            return zoom;
        }
        throw new java.io.IOException(((errorString) + zoomRes));
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return lastKnown.getZoom();
    }
}