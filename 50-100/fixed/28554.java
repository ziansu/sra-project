public static java.lang.String formatDate(java.lang.String unformattedDate) {
    if (!(unformattedDate.matches(io.husayn.fetch.utilities.DateUtility.UNFORMATTED_DATE_REGEX)))
        return unformattedDate;
    
    try {
        java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat(io.husayn.fetch.utilities.DateUtility.FORMATTED_DATE_FORMAT);
        java.util.Date date = dateFormat.parse(unformattedDate.substring(io.husayn.fetch.utilities.DateUtility.FROM_INDEX, io.husayn.fetch.utilities.DateUtility.TO_INDEX));
        return dateFormat.format(date);
    } catch (java.lang.Exception e) {
        return unformattedDate;
    }
}