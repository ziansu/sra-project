public void setStartDateTime(java.time.LocalDateTime startDateTime) {
    this.startDateTime = startDateTime;
    if (startDateTime != null) {
        startDateYear = startDateTime.getYear();
        startDateMonth = startDateTime.getMonthValue();
        startDateDayOfMonth = startDateTime.getDayOfMonth();
        startDateHour = startDateTime.getHour();
        startDateMinute = startDateTime.getMinute();
    }
}