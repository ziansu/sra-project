public playoutCore.calendar.dataStructures.Occurrence generateImageSpacer(java.time.ZonedDateTime startDateTime, java.time.ZonedDateTime endDateTime) {
    return generateImageSpacer(startDateTime, endDateTime, java.time.Duration.of(java.time.temporal.ChronoUnit.SECONDS.between(startDateTime, endDateTime), java.time.temporal.ChronoUnit.SECONDS));
}