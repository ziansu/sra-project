protected final void checkCache(net.sf.openrocket.rocketcomponent.FlightConfiguration configuration) {
    if (((rocketAeroModID) != (configuration.getRocket().getAerodynamicModID())) || ((rocketTreeModID) != (configuration.getRocket().getTreeModID()))) {
        rocketAeroModID = configuration.getRocket().getAerodynamicModID();
        rocketTreeModID = configuration.getRocket().getTreeModID();
        voidAerodynamicCache();
    }
}