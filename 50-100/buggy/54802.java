public static org.openpnp.spi.NozzleTip findNozzleTip(org.openpnp.spi.Nozzle nozzle, org.openpnp.model.Part part) throws java.lang.Exception {
    for (org.openpnp.spi.NozzleTip nozzleTip : nozzle.getNozzleTips()) {
        if (nozzleTip.canHandle(part)) {
            return nozzleTip;
        }
    }
    throw new java.lang.Exception(((("No compatible nozzle tip on nozzle " + nozzle) + " found for part ") + part));
}