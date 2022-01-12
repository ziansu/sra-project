@java.lang.Override
public void federationRestored() throws hla.rti1516e.exceptions.FederateInternalError {
    this.logger.info("federationRestored");
    try {
        this.myFederateAmbassador.federationRestored();
    } catch (hla.rti1516e.exceptions.FederateInternalError e) {
        this.logger.info(("federationRestored exception=" + (e.getMessage())));
        throw e;
    }
}