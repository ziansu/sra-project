protected void prepareToReceiveEvents(org.sensorhub.api.data.IStreamingDataInterface output) {
    java.lang.String outputName = output.getName();
    org.vast.swe.ScalarIndexer timeStampIndexer = timeStampIndexers.get(outputName);
    if (timeStampIndexer == null) {
        timeStampIndexer = org.vast.swe.SWEHelper.getTimeStampIndexer(output.getRecordDescription());
        timeStampIndexers.put(outputName, timeStampIndexer);
    }
    output.registerListener(this);
}