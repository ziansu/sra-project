public java.util.Date parseDate(java.lang.String date) throws java.text.ParseException {
    java.util.Date parsedDate = formatter.parse(date);
    return parsedDate;
}