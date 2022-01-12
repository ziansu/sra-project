protected final void checkCache(net.sf.openrocket.rocketcomponent.FlightConfiguration configuration) {
    if (((rocketAeroModID) != (configuration.getRocket().getAerodynamicModID())) || ((rocketTreeModID) != (configuration.getRocket().getTreeModID()))) {
        rocketAeroModID = configuration.getRocket().getAerodynamicModID();
        rocketTreeModID = configuration.getRocket().getTreeModID();
        net.sf.openrocket.aerodynamics.AbstractAerodynamicCalculator.log.debug("Voiding the aerodynamic cache");
        voidAerodynamicCache();
    }
}