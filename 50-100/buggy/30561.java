@java.lang.Override
public void announceSynchronizationPoint(final java.lang.String synchronizationPointLabel, final byte[] userSuppliedTag) throws hla.rti1516e.exceptions.FederateInternalError {
    this.logger.info(((("announceSynchronizationPoint synchronizationPointLabel=" + synchronizationPointLabel) + ", userSuppliedTag=") + (java.util.Arrays.toString(userSuppliedTag))));
    try {
        this.myFederateAmbassador.announceSynchronizationPoint(synchronizationPointLabel, userSuppliedTag);
    } catch (hla.rti1516e.exceptions.FederateInternalError e) {
        this.logger.info(("announceSynchronizationPoint exception=" + (e.getMessage())));
        throw e;
    }
}