@java.lang.Override
public void onResult(dji.sdk.api.GroundStation.DJIGroundStationTypeDef.GroundStationResult result) {
    if (com.jarone.litterary.drone.GroundStation.resultSuccess(result)) {
        DroneState.groundStationConnected = true;
        try {
            run.run();
        } catch (java.lang.Exception e) {
            com.jarone.litterary.handlers.MessageHandler.d(("withConnection: " + (e.toString())));
        }
    }else {
        DroneState.groundStationConnected = false;
        com.jarone.litterary.handlers.MessageHandler.d("withConnection: FAILURE");
    }
}