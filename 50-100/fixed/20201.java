private boolean isTimeOk() {
    java.time.LocalDateTime now = java.time.LocalDateTime.now(java.time.ZoneId.systemDefault());
    if ((getStartTime()) == null) {
        setStartTime(now);
        return true;
    }
    java.time.LocalDateTime nowMinus24 = now.minusHours(24);
    return !(nowMinus24.isAfter(getStartTime()));
}