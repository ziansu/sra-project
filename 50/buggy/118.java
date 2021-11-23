public static java.time.LocalDateTime getNextYear() {
    java.time.LocalDateTime date = java.time.LocalDateTime.now();
    date.plusYears(1);
    return date;
}