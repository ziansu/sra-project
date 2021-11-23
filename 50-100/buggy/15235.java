@java.lang.Override
public float onPositionRequested(int id, float x) {
    if (id < 0) {
        if (id == (org.wycliffeassociates.translationrecorder.Playback.markers.MarkerHolder.END_MARKER_ID)) {
            x = java.lang.Math.max(mMarkerMediator.getMarker(MarkerHolder.START_MARKER_ID).getMarkerX(), x);
        }else {
            x += mMarkerMediator.getMarker(MarkerHolder.START_MARKER_ID).getWidth();
            x = java.lang.Math.min(mMarkerMediator.getMarker(MarkerHolder.END_MARKER_ID).getMarkerX(), x);
        }
    }
    return x;
}