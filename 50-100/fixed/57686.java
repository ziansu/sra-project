protected void onMarkersUpdated(java.util.List<D> items, boolean performAnimation) {
    for (D item : items) {
        dev.xesam.android.map.move.MoveMarker<D> moveMarker = mMoveMarkers.get(getKey(item));
        moveMarker.stopMove();
        onMarkerUpdated(moveMarker, moveMarker.getData(), item, performAnimation);
        moveMarker.setData(item);
    }
}