public java.lang.String getUtcDateForReset(int reset, long uptime) {
    if ((timeZero) == null)
        return null;
    
    if (reset >= (timeZero.size()))
        return null;
    
    java.util.Date dt = new java.util.Date(((timeZero.get(reset)) + (uptime * 1000)));
    common.Spacecraft.timeDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
    java.lang.String time = common.Spacecraft.dateDateFormat.format(dt);
    return time;
}