@java.lang.Override
public void turnInteractionsOff(final hla.rti1516e.InteractionClassHandle theHandle) throws hla.rti1516e.exceptions.FederateInternalError {
    this.logger.info(("turnInteractionsOff theHandle=" + theHandle));
    try {
        this.myFederateAmbassador.turnInteractionsOff(theHandle);
    } catch (hla.rti1516e.exceptions.FederateInternalError e) {
        this.logger.error(("turnInteractionsOff exception=" + (e.getMessage())));
        throw e;
    }
}