public boolean isThisWeek(org.joda.time.LocalDate date) {
    org.joda.time.LocalDate now = clock.now();
    org.joda.time.LocalDate beginOfWeek = now.withDayOfWeek(DateTimeConstants.MONDAY);
    org.joda.time.LocalDate endOfWeek = now.withDayOfWeek(DateTimeConstants.SUNDAY);
    return isBetween(date, beginOfWeek, endOfWeek);
}