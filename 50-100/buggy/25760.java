private java.time.LocalDateTime adjustTimeToAfterReference(java.time.LocalDateTime dateTime, java.time.LocalDateTime reference, java.util.Set<java.lang.String> parseElements) {
    if (!(parseElements.contains(lifetracker.parser.datetime.DateTimeParser.NATTY_TIME_FIELD))) {
        if ((dateTime.isBefore(reference)) || (dateTime.isEqual(reference))) {
            dateTime = java.time.LocalDateTime.of(dateTime.toLocalDate(), reference.toLocalTime().plusHours(1));
        }
    }
    return dateTime;
}