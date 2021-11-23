@java.lang.Override
public void onBtnCreateRouteClick(java.util.Map<java.lang.String, com.google.android.gms.maps.model.Marker> markerArrayMap) {
    getDirection(hu.banyai.robert.mapnotification.data.remote.LocationManager.getInstance().getLastLocation(), markerArrayMap);
    hu.banyai.robert.mapnotification.data.remote.LocationManager.getInstance().requestLocationUpdate(this);
}