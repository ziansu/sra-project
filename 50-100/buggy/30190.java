public static org.openpnp.spi.NozzleTip findNozzleTip(org.openpnp.spi.Head head, org.openpnp.model.Part part) throws java.lang.Exception {
    for (org.openpnp.spi.Nozzle nozzle : head.getNozzles()) {
        try {
            return org.openpnp.spi.base.AbstractPnpJobProcessor.findNozzleTip(nozzle, part);
        } catch (java.lang.Exception e) {
        }
    }
    throw new java.lang.Exception(("No compatible nozzle tip on any nozzle found for part " + part));
}