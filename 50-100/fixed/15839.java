@java.lang.Override
public void requestFederationRestoreFailed(final java.lang.String label) throws hla.rti1516e.exceptions.FederateInternalError {
    this.logger.info(("requestFederationRestoreFailed label=" + label));
    try {
        this.myFederateAmbassador.requestFederationRestoreFailed(label);
    } catch (hla.rti1516e.exceptions.FederateInternalError e) {
        this.logger.error(("requestFederationRestoreFailed exception=" + (e.getMessage())));
        throw e;
    }
}