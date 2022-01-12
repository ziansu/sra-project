public static java.util.Date UTCStringToDate(java.lang.String utc) throws java.text.ParseException {
    if (utc == null) {
        return null;
    }
    java.text.DateFormat df = new java.text.SimpleDateFormat(org.hpccsystems.ws.client.utils.Utils.ISO8601_FORMAT);
    return df.parse(utc);
}