private java.sql.Date convertStringToDate(java.lang.String string) throws java.text.ParseException {
    java.sql.Date retval = new java.sql.Date(CrConstants.CHECK_SIMPLE_DATE_FORMAT.parse(string).getTime());
    return retval;
}