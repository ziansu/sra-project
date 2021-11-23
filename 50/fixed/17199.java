public void sendGuidedPoint(com.o3dr.services.android.lib.coordinate.LatLong point, boolean force) {
    com.o3dr.android.client.apis.ControlApi.getApi(this).goTo(point, force, null);
}