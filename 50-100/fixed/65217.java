@java.lang.Override
public void initiateFederateSave(final java.lang.String label, final hla.rti1516e.LogicalTime time) throws hla.rti1516e.exceptions.FederateInternalError {
    this.logger.info(((("initiateFederateSave label=" + label) + ", time=") + (time.toString())));
    try {
        this.myFederateAmbassador.initiateFederateSave(label, time);
    } catch (hla.rti1516e.exceptions.FederateInternalError e) {
        this.logger.error(("initiateFederateSave exception=" + (e.getMessage())));
        throw e;
    }
}