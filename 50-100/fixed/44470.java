@java.lang.Override
public void synchronizationPointRegistrationFailed(final java.lang.String synchronizationPointLabel, final hla.rti1516e.SynchronizationPointFailureReason reason) throws hla.rti1516e.exceptions.FederateInternalError {
    this.logger.info((("synchronizationPointRegistrationFailed synchronizationPointLabel=" + synchronizationPointLabel) + (reason.toString())));
    try {
        this.myFederateAmbassador.synchronizationPointRegistrationFailed(synchronizationPointLabel, reason);
    } catch (hla.rti1516e.exceptions.FederateInternalError e) {
        this.logger.error(("synchronizationPointRegistrationFailed exception=" + (e.getMessage())));
        throw e;
    }
}