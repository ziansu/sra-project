public java.lang.String parse(java.lang.String date) {
    if (date == null) {
        return null;
    }else
        if (date.equals("NULL")) {
            return null;
        }
    
    if ((formatter) == null) {
        this.formatter = org.joda.time.format.DateTimeFormat.forPattern(datePattern);
    }
    return org.joda.time.LocalDateTime.parse(date).toDateTime(tz).toString();
}