@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    if ((newCircle) != null) {
        newCircle.remove();
    }
    com.google.android.gms.maps.model.CircleOptions circleOptions = new com.google.android.gms.maps.model.CircleOptions().center(latLng).radius(_radiusChanged).fillColor(1082797026).strokeColor(Color.MAGENTA).strokeWidth(5);
    newCircle = mMap.addCircle(circleOptions);
}