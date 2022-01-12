private java.time.LocalDateTime roundUpTime(java.time.LocalDateTime dateTime) {
    int minutes = dateTime.getMinute();
    if (minutes == (EXACT_AN_HOUR)) {
        return dateTime;
    }
    return dateTime.plusMinutes(java.lang.Math.abs(((HALF_AN_HOUR) - minutes)));
}