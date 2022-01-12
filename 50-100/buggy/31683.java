static org.joda.time.LocalDate parseCopyReturn(java.lang.String str) {
    org.joda.time.format.DateTimeFormatter fmt = org.joda.time.format.DateTimeFormat.forPattern("dd.MM.yyyy").withLocale(java.util.Locale.GERMAN);
    final java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("[0-9.-]{4,}").matcher(str);
    if (matcher.find()) {
        return fmt.parseLocalDate(matcher.group());
    }else {
        return null;
    }
}