private long correctTimeStamp(long daysSinceEpoch) {
    long timestamp = (daysSinceEpoch * (water.parser.orc.OrcParser.DAY_TO_MS)) + (water.parser.orc.OrcParser.ADD_OFFSET);
    org.joda.time.DateTime date = new org.joda.time.DateTime(timestamp);
    int hour = date.hourOfDay().get();
    if (hour == 0)
        return timestamp;
    else
        return timestamp - (water.parser.orc.OrcParser.HOUR_OFFSET);
    
}