public void measureSentMessages(int queryID) {
    if ((measurementCollector) != null) {
        java.lang.String[] values = new java.lang.String[1 + (sentMessages.length)];
        values[0] = java.lang.Integer.toString(queryID);
        for (int i = 1; i < (sentMessages.length); i++) {
            values[i] = java.lang.Long.toString(sentMessages[i]);
            sentMessages[i] = 0;
        }
        measurementCollector.measureValue(MeasurementType.SLAVE_SENT_MAPPING_BATCHES_TO_SLAVE, values);
    }
}