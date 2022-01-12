private final void doMoveOutOfBounds(int[] diff) {
    com.google.android.maps.GeoPoint cen = mv.getMapCenter();
    final android.graphics.Point cenPx = mv.getProjection().toPixels(cen, null);
    cenPx.x += diff[0];
    cenPx.y += diff[1];
    cen = mv.getProjection().fromPixels(cenPx.x, cenPx.y);
    if (autoBoundSnap) {
        aml.snapTo(cen);
    }else {
        aml.animateTo(cen);
    }
}