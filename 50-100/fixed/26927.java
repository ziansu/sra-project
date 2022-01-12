private static void cloneConfigs(final net.sf.openrocket.rocketcomponent.Rocket source, net.sf.openrocket.rocketcomponent.Rocket dest) {
    source.checkState();
    dest.checkState();
    dest.selectedConfiguration = source.selectedConfiguration.clone();
    for (final net.sf.openrocket.rocketcomponent.FlightConfiguration config : source.configSet) {
        dest.configSet.set(config.getId(), config.clone());
    }
}