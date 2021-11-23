public void setLocalDateTime(java.lang.String time) {
    localDateTime = ((java.time.LocalDateTime) (dateTimeFormatter.parse(time)));
}