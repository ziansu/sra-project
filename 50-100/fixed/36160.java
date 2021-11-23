@java.lang.Override
public void connectionLost(final java.lang.String faultDescription) throws hla.rti1516e.exceptions.FederateInternalError {
    this.logger.info(("connectionLost faultDescription=" + faultDescription));
    try {
        this.myFederateAmbassador.connectionLost(faultDescription);
    } catch (hla.rti1516e.exceptions.FederateInternalError e) {
        this.logger.error(("connectionLost exception=" + (e.getMessage())));
        throw e;
    }
}