protected void publishLocation() {
    try {
        com.capgemini.hackathon.device.simulation.model.VehicleLocation vl = new com.capgemini.hackathon.device.simulation.model.VehicleLocation(currentLocation.getLatitude(), currentLocation.getLongitude(), getId().toString());
        com.google.gson.JsonObject event = vl.asJson();
        addMetainformationWhenPublishLocation(event);
        getDeviceClient().publishEvent(VehicleLocation.EVENT, event, 1);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}