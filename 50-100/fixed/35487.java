public java.util.Date determineDateFormat(java.lang.String dateString, java.util.Locale loc) {
    java.util.ArrayList<java.lang.String> DATE_FORMAT = formatList();
    for (java.lang.String regexp : DATE_FORMAT) {
        try {
            return parse(dateString, regexp, loc);
        } catch (java.text.ParseException e) {
            continue;
        }
    }
    return null;
}