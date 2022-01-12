private static java.time.LocalDate parseLocalDate(java.lang.String string) {
    if (org.apache.commons.lang3.StringUtils.isBlank(string)) {
        throw new java.lang.IllegalArgumentException("Empty string provided, you should provide a date, preferably parseable.");
    }
    for (java.time.format.DateTimeFormatter formatter : consulting.cochez.accounting.config.jackson.LocalDateDeserializer.FORMATS) {
        try {
            return java.time.LocalDate.parse(string, formatter);
        } catch (java.lang.IllegalArgumentException | java.time.format.DateTimeParseException e) {
        }
    }
    throw new java.lang.IllegalArgumentException(java.lang.String.format("Could not parse date %s", string));
}