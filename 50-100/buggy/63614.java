@java.lang.Override
public boolean start() throws java.io.IOException {
    try {
        inputResult = executeSalesforceQuery();
        if ((inputResult.getSize()) == 0) {
            return false;
        }
        inputRecords = inputResult.getRecords();
        inputRecordsIndex = 0;
        boolean startable = (inputRecords.length) > 0;
        if (startable) {
            (dataCount)++;
        }
        return startable;
    } catch (com.sforce.ws.ConnectionException e) {
        throw new java.io.IOException(e);
    }
}