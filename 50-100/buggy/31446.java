public java.lang.String getToTime() {
    java.time.Duration d = java.time.Duration.between(java.time.LocalTime.now(), toTime);
    if ((d.toMillis()) < 1000) {
        this.interrupt();
    }
    return java.time.LocalTime.MIDNIGHT.plus(d).format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss"));
}