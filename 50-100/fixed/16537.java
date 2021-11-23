@java.lang.Override
public void stopRegistrationForObjectClass(final hla.rti1516e.ObjectClassHandle theClass) throws hla.rti1516e.exceptions.FederateInternalError {
    this.logger.info(("stopRegistrationForObjectClass theClass=" + (theClass.toString())));
    try {
        this.myFederateAmbassador.stopRegistrationForObjectClass(theClass);
    } catch (hla.rti1516e.exceptions.FederateInternalError e) {
        this.logger.error(("stopRegistrationForObjectClass exception=" + (e.getMessage())));
        throw e;
    }
}