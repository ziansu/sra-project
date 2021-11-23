public static long parseTime(java.lang.String time) throws java.text.ParseException {
    synchronized(chatty.util.api.Util.PARSE_DATE) {
        java.util.Date parsed = chatty.util.api.Util.PARSE_DATE.parse(time);
        return parsed.getTime();
    }
}