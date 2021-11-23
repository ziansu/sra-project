public static java.lang.String formatDate(java.lang.String unformattedDate) {
    if (!(unformattedDate.matches(io.husayn.fetch.utilities.DateUtility.UNFORMATTED_DATE_REGEX)))
        return unformattedDate;
    
    try {
        java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat(io.husayn.fetch.utilities.DateUtility.FORMATTED_DATE_FORMAT);
        java.util.Date parsedDate = dateFormat.parse(unformattedDate.substring(io.husayn.fetch.utilities.DateUtility.FROM_INDEX, io.husayn.fetch.utilities.DateUtility.TO_INDEX));
        java.sql.Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
        return timestamp.toString();
    } catch (java.lang.Exception e) {
        return unformattedDate;
    }
}