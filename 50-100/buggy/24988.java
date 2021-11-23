@java.lang.Override
public void multipleObjectInstanceNameReservationFailed(final java.util.Set<java.lang.String> objectNames) throws hla.rti1516e.exceptions.FederateInternalError {
    this.logger.info(("multipleObjectInstanceNameReservationFailed objectNames=" + (objectNames.toString())));
    try {
        this.myFederateAmbassador.multipleObjectInstanceNameReservationFailed(objectNames);
    } catch (hla.rti1516e.exceptions.FederateInternalError e) {
        this.logger.info(("multipleObjectInstanceNameReservationFailed exception=" + (e.getMessage())));
        throw e;
    }
}