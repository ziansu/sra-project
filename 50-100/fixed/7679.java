protected java.time.LocalDate parseStringToDate(java.lang.String inputDateStr, java.lang.String inputPattern, java.time.chrono.Chronology inputChronology) {
    if ((inputDateStr != null) && (!(inputDateStr.isEmpty()))) {
        java.util.Locale locale = java.util.Locale.getDefault(java.util.Locale.Category.FORMAT);
        java.time.format.DateTimeFormatter inputDateTimeFormatter = new java.time.format.DateTimeFormatterBuilder().parseLenient().appendPattern(inputPattern).toFormatter().withChronology(inputChronology).withDecimalStyle(java.time.format.DecimalStyle.of(locale));
        return parseStringToDate(inputDateStr, inputDateTimeFormatter, inputChronology);
    }
    return null;
}