public void setStartTime(final java.lang.String resource, final org.joda.time.DateTime startTime) {
    com.gooddata.util.Validate.notEmpty(resource, "resource can't be empty");
    com.gooddata.util.Validate.notNull(startTime, "startTime can't be null");
    startTimes = ((startTimes) == null) ? new java.util.TreeMap<java.lang.String, org.joda.time.DateTime>() : startTimes;
    startTimes.put((resource + "StartDate"), startTime);
}