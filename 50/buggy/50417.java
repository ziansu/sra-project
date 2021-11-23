private void updateConfigurations() {
    this.selectedConfiguration.update();
    for (net.sf.openrocket.rocketcomponent.FlightConfiguration config : configSet.values()) {
        config.update();
    }
}