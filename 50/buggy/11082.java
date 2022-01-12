private boolean areDatesCorrect(java.time.LocalDateTime start, java.time.LocalDateTime end) {
    return (start.compareTo(end)) < 0;
}