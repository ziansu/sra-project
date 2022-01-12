private java.util.Date date(java.lang.String s) {
    return java.util.Date.from(java.time.ZonedDateTime.parse(s).toInstant());
}