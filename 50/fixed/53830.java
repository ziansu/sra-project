@java.lang.Override
public java.time.Duration parse(java.lang.String millisecondsAsString, java.util.Locale locale) throws java.text.ParseException {
    return java.time.Duration.ofMillis(java.lang.Long.parseLong(millisecondsAsString));
}