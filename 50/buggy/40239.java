public void doGuidedTakeoff(double altitude) {
    com.o3dr.android.client.apis.ControlApi.getApi(this).takeoff(altitude);
}