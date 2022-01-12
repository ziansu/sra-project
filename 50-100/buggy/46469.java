private org.joda.time.LocalDateTime createDueTo(final org.joda.time.LocalDateTime dateTime) {
    org.joda.time.LocalDate localDate = dateTime.toLocalDate().plusDays((1 + (this.random.nextInt(15))));
    while (org.smartdeveloperhub.harvesters.it.testing.generator.Utils.isWorkingDay(localDate)) {
        localDate = localDate.plusDays(1);
    } 
    final org.joda.time.LocalTime localTime = this.workDayStartTime.plusHours(workingHoursPerDay());
    return localDate.toLocalDateTime(localTime);
}