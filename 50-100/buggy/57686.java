protected void onMarkersUpdated(java.util.List<D> items, boolean performAnimation) {
    for (D item : items) {
        dev.xesam.android.map.move.MoveMarker<D> moveMarker = mMoveMarkers.get(getKey(item));
        moveMarker.stopMove();
        moveMarker.setData(item);
        onMarkerUpdated(moveMarker, item, performAnimation);
    }
}