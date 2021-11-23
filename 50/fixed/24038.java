public java.lang.String format(java.util.Date date, int cvDatePrecisionId) {
    if ((date != null) && (cvDatePrecisionId != 1)) {
        return getDateFormat(cvDatePrecisionId).format(date);
    }
    return "";
}