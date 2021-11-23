public java.lang.String getStringDate(java.util.Date date) {
    LOGGER.debug("getting string date for {}", date);
    if (date != null) {
        java.text.SimpleDateFormat sdfDate = new java.text.SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
        return sdfDate.format(date);
    }
    return null;
}