public static boolean switchOff() {
    scheduler.Scheduler.serverMessage(2, "Pi4J Pin Off");
    if (Scheduler.server_controlActive) {
        scheduler.Pi4j.pin.high();
    }
    return false;
}