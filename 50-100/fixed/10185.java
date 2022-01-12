public void setTimePeriod(java.lang.Long startTimeParam, java.lang.Long endTimeParam) {
    long startTime = (startTimeParam == null) ? 0L : startTimeParam;
    long endTime = (endTimeParam == null) ? teammates.common.util.TimeHelper.now(0.0).getTimeInMillis() : endTimeParam;
    query.startTimeMillis(startTime);
    query.endTimeMillis(endTime);
    this.startTime = startTime;
    this.endTime = endTime;
}