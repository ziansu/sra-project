public void setLocalDateTime(java.lang.String time) {
    localDateTime = java.time.LocalDateTime.parse(time, dateTimeFormatter);
}