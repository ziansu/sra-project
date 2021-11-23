@java.lang.Override
public void initiateFederateRestore(final java.lang.String label, final java.lang.String federateName, final hla.rti1516e.FederateHandle federateHandle) throws hla.rti1516e.exceptions.FederateInternalError {
    this.logger.info(((((("initiateFederateRestore label=" + label) + ", federateName=") + federateName) + ", federateHandle=") + (federateHandle.toString())));
    try {
        this.myFederateAmbassador.initiateFederateRestore(label, federateName, federateHandle);
    } catch (hla.rti1516e.exceptions.FederateInternalError e) {
        this.logger.error(("initiateFederateRestore exception=" + (e.getMessage())));
        throw e;
    }
}