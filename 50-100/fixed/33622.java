private java.time.LocalDateTime getNextHour(int minute) {
    java.time.LocalDateTime time = java.time.LocalDateTime.now();
    int currentMinute = time.getMinute();
    if (currentMinute >= minute)
        time = time.plusHours(1);
    
    return time.truncatedTo(java.time.temporal.ChronoUnit.HOURS).plusMinutes(minute);
}