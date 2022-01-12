private void setDisplayedZone(java.lang.String previousZone, java.lang.String nextZone, java.util.Calendar lDate) {
    long previousOffset = java.util.TimeZone.getTimeZone(previousZone).getOffset(localDate.getTimeInMillis());
    long finalOffset = java.util.TimeZone.getTimeZone(nextZone).getOffset(localDate.getTimeInMillis());
    lDate.add(java.util.Calendar.MILLISECOND, ((int) (finalOffset - previousOffset)));
    setDateTime(localDate);
}