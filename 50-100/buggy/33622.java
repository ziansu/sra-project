private java.time.LocalDateTime getNextHour(int minute) {
    java.time.LocalDateTime time = java.time.LocalDateTime.now();
    int currentMinute = time.getMinute();
    if (currentMinute >= minute)
        time.plusHours(1);
    
    time.truncatedTo(java.time.temporal.ChronoUnit.HOURS);
    time.plusMinutes(minute);
    return time;
}