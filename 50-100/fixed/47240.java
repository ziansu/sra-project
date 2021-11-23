private java.util.Optional<org.synyx.urlaubsverwaltung.restapi.availability.TimedAbsence> checkForFreeTime(org.joda.time.DateMidnight currentDay, org.synyx.urlaubsverwaltung.core.person.Person person) {
    org.synyx.urlaubsverwaltung.core.period.DayLength expectedWorktime = getExpectedWorktimeFor(person, currentDay);
    java.math.BigDecimal expectedWorktimeDuration = expectedWorktime.getDuration();
    boolean expectedWorktimeIsLessThanFullDay = (expectedWorktimeDuration.compareTo(java.math.BigDecimal.ONE)) < 0;
    if (expectedWorktimeIsLessThanFullDay) {
        return java.util.Optional.of(new org.synyx.urlaubsverwaltung.restapi.availability.TimedAbsence(expectedWorktime.getInverse(), TimedAbsence.Type.FREETIME));
    }
    return java.util.Optional.empty();
}