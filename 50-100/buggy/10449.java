public static java.util.Date parseDate(java.lang.String dateStr) {
    java.util.Date date = null;
    try {
        date = delta.games.lotro.utils.Formats._dateFormatter.parse(dateStr);
    } catch (java.text.ParseException parseException) {
    }
    if (date == null) {
        try {
            date = delta.games.lotro.utils.Formats._dateTimeFormatter.parse(dateStr);
        } catch (java.text.ParseException parseException) {
        }
    }
    return date;
}