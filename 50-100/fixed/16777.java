private void start() {
    position.set("state", "start");
    position.set("trip", java.util.UUID.randomUUID().toString());
    position.set("startTripTime", position.getDeviceTime().getTime());
    position.set("tripTime", 0);
    position.set("maxSpeed", position.getSpeed());
    updateOdometer(device, position);
}