public boolean connect() {
    boolean result = true;
    try {
        com.stratio.crossdata.common.result.Result connectionResult = crossdataDriver.connect(crossdataDriver.getUserName());
        com.stratio.crossdata.sh.Shell.LOG.info("Driver connections established");
        com.stratio.crossdata.sh.Shell.LOG.info(com.stratio.crossdata.sh.utils.ConsoleUtils.stringResult(connectionResult));
    } catch (com.stratio.crossdata.common.exceptions.ConnectionException ce) {
        result = false;
        com.stratio.crossdata.sh.Shell.LOG.error(ce.getMessage(), ce);
    }
    return result;
}