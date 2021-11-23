private void showOnMap(net.osmand.data.LatLon mapCenter, int mapZoom) {
    net.osmand.plus.activities.MapActivity mapActivity = ((net.osmand.plus.activities.MapActivity) (getActivity()));
    if (mapActivity != null) {
        mapActivity.setMapLocation(mapCenter.getLatitude(), mapCenter.getLongitude());
        mapActivity.getMapView().setIntZoom(mapZoom);
    }
    closeWizard();
}