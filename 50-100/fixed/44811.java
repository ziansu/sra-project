@java.lang.Override
public void timeRegulationEnabled(final hla.rti1516e.LogicalTime time) throws hla.rti1516e.exceptions.FederateInternalError {
    this.logger.info(("timeRegulationEnabled time=" + (time.toString())));
    try {
        this.myFederateAmbassador.timeRegulationEnabled(time);
    } catch (hla.rti1516e.exceptions.FederateInternalError e) {
        this.logger.error(("timeRegulationEnabled exception=" + (e.getMessage())));
        throw e;
    }
}