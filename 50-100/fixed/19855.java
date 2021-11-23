@java.lang.Override
public boolean onMarkerClick(final com.google.android.gms.maps.model.Marker marker) {
    if (mDeleteMode) {
        com.task.pins.entity.Pin pin = new com.task.pins.entity.Pin(mUserId, marker.getPosition());
        changeMarkerSelection(marker, pin);
    }else {
        moveCameraToLocation(marker.getPosition(), com.task.pins.map.MapsActivity.ON_MY_POSITION_CLICK_MOVE_DURATION);
    }
    return true;
}