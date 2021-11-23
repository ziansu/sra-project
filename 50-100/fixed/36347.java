public java.lang.Boolean containsCurrentTime() {
    java.time.LocalDateTime now = java.time.LocalDateTime.now();
    if (((this.start.isBefore(now)) || (this.start.equals(now))) && (this.getEndTime().isAfter(now))) {
        return true;
    }else {
        return false;
    }
}