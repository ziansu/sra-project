@java.lang.Override
public void federationSaveStatusResponse(final hla.rti1516e.FederateHandleSaveStatusPair[] response) throws hla.rti1516e.exceptions.FederateInternalError {
    this.logger.info(("federationSaveStatusResponse response=" + (response.toString())));
    try {
        this.myFederateAmbassador.federationSaveStatusResponse(response);
    } catch (hla.rti1516e.exceptions.FederateInternalError e) {
        this.logger.info(("federationSaveStatusResponse exception=" + (e.getMessage())));
        throw e;
    }
}