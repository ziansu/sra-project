public static void main(java.lang.String[] args) {
    java.lang.System.out.println(com.fh.util.DateUtil.getDays());
    java.time.ZoneId australia = java.time.ZoneId.of("Australia/Sydney");
    java.lang.String str = "2015-01-05 17:00";
    java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    java.time.LocalDateTime localtDateAndTime = java.time.LocalDateTime.now();
    java.time.ZonedDateTime dateAndTimeInSydney = java.time.ZonedDateTime.of(localtDateAndTime, australia);
    java.lang.System.out.println(("Current date and time in a particular timezone : " + dateAndTimeInSydney));
    java.time.ZonedDateTime utcDate = dateAndTimeInSydney.withZoneSameInstant(java.time.ZoneOffset.UTC);
    java.lang.System.out.println(("Current date and time in UTC : " + utcDate));
}