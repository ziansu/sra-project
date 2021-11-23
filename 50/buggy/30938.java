private java.time.LocalDateTime roundUpTime(java.time.LocalDateTime dateTime) {
    int minutes = dateTime.getMinute();
    if (minutes == (EXACT_AN_HOUR)) {
        return dateTime;
    }
    return dateTime.plusMinutes(((HALF_AN_HOUR) - minutes));
}