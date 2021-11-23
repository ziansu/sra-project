public boolean isInvalidDate(java.lang.String datetime) {
    try {
        java.util.Date dt = new java.text.SimpleDateFormat(org.talend.components.marketo.MarketoConstants.DATETIME_PATTERN_PARAM).parse(datetime);
        return true;
    } catch (java.text.ParseException e) {
        return false;
    }
}