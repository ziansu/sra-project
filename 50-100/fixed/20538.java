private void zoomTo(com.esri.core.geometry.Geometry geometry) {
    com.esri.core.geometry.Envelope envelope = new com.esri.core.geometry.Envelope();
    geometry.queryEnvelope(envelope);
    int vh = map.getMeasuredHeight();
    int vw = map.getMeasuredWidth();
    double eh = envelope.getHeight();
    double ew = envelope.getWidth();
    double res = java.lang.Math.max((eh / vh), (ew / vw));
    map.zoomToResolution(envelope.getCenter(), res);
}