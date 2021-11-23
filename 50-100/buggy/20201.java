private boolean isTimeOk() {
    if ((getStartTime()) == null) {
        setStartTime(java.time.LocalDateTime.now(java.time.ZoneId.systemDefault()));
        return true;
    }
    java.time.LocalDateTime now = java.time.LocalDateTime.now(java.time.ZoneId.systemDefault());
    java.time.LocalDateTime nowMinus24 = now.minusHours(24);
    return !(nowMinus24.isAfter(getStartTime()));
}