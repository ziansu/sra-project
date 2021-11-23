public java.lang.String formatDateToString(java.time.LocalDate localDate, java.time.chrono.Chronology outputChronology, java.lang.String outputPattern) {
    return formatDateToString(localDate, outputChronology, java.time.format.DateTimeFormatter.ofPattern((outputPattern == null ? org.talend.dataquality.converters.DateCalendarConverter.DEFAULT_OUTPUT_PATTERN : outputPattern)));
}