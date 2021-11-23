public java.lang.String getDateAt(java.util.Date date, boolean isoFormat) {
    return getDateAt(date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate(), isoFormat);
}