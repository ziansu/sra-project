public void setStartTime(java.time.LocalTime newStartTime) throws taskie.exceptions.TaskDateInvalidException, taskie.exceptions.TaskDateNotSetException {
    if ((_startDate) == null) {
        throw new taskie.exceptions.TaskDateNotSetException("Start date not set");
    }
    if (newStartTime == null) {
        _startTime = null;
    }else {
        long difference = java.time.temporal.ChronoUnit.NANOS.between(_startTime, newStartTime);
        _startTime = newStartTime;
        _endTime = _endTime.plusNanos(difference);
    }
}