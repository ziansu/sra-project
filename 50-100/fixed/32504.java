private java.util.List<org.threeten.bp.LocalDate> getDaysBetweenInReverse(org.threeten.bp.LocalDate from, org.threeten.bp.LocalDate to) {
    java.util.List<org.threeten.bp.LocalDate> daysBetween = new java.util.ArrayList<>();
    org.threeten.bp.ZonedDateTime fromInUtc = from.atStartOfDay(ZoneOffset.UTC);
    org.threeten.bp.ZonedDateTime toInUtc = to.atStartOfDay(ZoneOffset.UTC);
    while (toInUtc.isAfter(fromInUtc)) {
        daysBetween.add(toInUtc.toLocalDate());
        toInUtc = toInUtc.minusDays(1);
    } 
    daysBetween.add(fromInUtc.toLocalDate());
    return daysBetween;
}