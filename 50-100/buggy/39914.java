public boolean dispatchHLT(rcms.utilities.daqaggregator.data.DAQ daq) {
    try {
        java.lang.Double d = getHLTInfo(daq.getRunNumber());
        daq.setHltRate(d);
        return true;
    } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        rcms.utilities.daqaggregator.datasource.F3DataRetriever.logger.warn("Could not retrieve F3 HLT rate,  json mapping exception: ", e);
    } catch (java.io.IOException e) {
        rcms.utilities.daqaggregator.datasource.F3DataRetriever.logger.warn("Could not retrieve F3 HLT rate, IO exception: ", e);
    }
    return false;
}