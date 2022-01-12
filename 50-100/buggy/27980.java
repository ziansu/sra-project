public static org.openpnp.spi.Feeder findFeeder(org.openpnp.spi.Machine machine, org.openpnp.model.Part part) throws java.lang.Exception {
    for (org.openpnp.spi.Feeder feeder : machine.getFeeders()) {
        if (((feeder.getPart()) == part) && (feeder.isEnabled())) {
            return feeder;
        }
    }
    throw new java.lang.Exception(("No compatible, enabled feeder found for part " + part));
}