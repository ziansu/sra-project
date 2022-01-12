public java.sql.Time getTimeToComplete() {
    return new java.sql.Time(((timeToComplete) - (util.TimeUtil.TIME_OFFSET)));
}