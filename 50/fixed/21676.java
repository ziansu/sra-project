public void setScheduledDate(java.time.ZonedDateTime scheduledDate) {
    if (scheduledDate != null) {
        this.scheduledDate = scheduledDate.withZoneSameInstant(java.time.ZoneOffset.UTC);
    }else {
        this.scheduledDate = scheduledDate;
    }
}