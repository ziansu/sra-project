public void setStartTime(final java.lang.String resource, final org.joda.time.DateTime startTime) {
    com.gooddata.util.Validate.notEmpty(resource, "resource can't be empty");
    com.gooddata.util.Validate.notNull(startTime, "startTime can't be null");
    startTimes = ((startTimes) == null) ? new java.util.TreeMap<java.lang.String, java.lang.String>() : startTimes;
    startTimes.put((resource + "StartDate"), com.gooddata.connector.Zendesk4ProcessExecution.FORMATTER.print(startTime));
}