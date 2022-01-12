@java.lang.Override
public void run() {
    final int takeOffAltitude = getAppPrefs().getDefaultAltitude();
    final com.o3dr.android.client.Drone drone = getDrone();
    com.o3dr.android.client.apis.VehicleApi.getApi(drone).takeoff(takeOffAltitude, new com.o3dr.services.android.lib.model.SimpleCommandListener() {
        @java.lang.Override
        public void onSuccess() {
            com.o3dr.android.client.apis.VehicleApi.getApi(drone).setVehicleMode(VehicleMode.COPTER_AUTO);
        }
    });
}