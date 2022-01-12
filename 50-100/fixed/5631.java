public java.util.Date getDateOfBirth(java.lang.String dateString) {
    java.text.DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd");
    java.util.Date date = null;
    try {
        if ((dateString != null) && (!("".equals(dateString)))) {
            LOGGER.debug("getting date for {}", dateString);
            date = df.parse(dateString);
        }
    } catch (java.text.ParseException e) {
        LOGGER.error("parsing date of birth", e);
    }
    return date;
}