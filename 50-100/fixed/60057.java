@java.lang.Override
public void federationSynchronized(final java.lang.String synchronizationPointLabel, final hla.rti1516e.FederateHandleSet failedToSyncSet) throws hla.rti1516e.exceptions.FederateInternalError {
    this.logger.info(((("federationSynchronized synchronizationPointLabel=" + synchronizationPointLabel) + ", failedToSyncSet=") + (failedToSyncSet.toString())));
    try {
        this.myFederateAmbassador.federationSynchronized(synchronizationPointLabel, failedToSyncSet);
    } catch (hla.rti1516e.exceptions.FederateInternalError e) {
        this.logger.error(("federationSynchronized exception=" + (e.getMessage())));
        throw e;
    }
}