public void setEndDate(java.lang.String newEndDate) throws java.lang.IllegalArgumentException {
    java.lang.String oldEndTime = ((padWithZero(endDateTime.getHour())) + " ") + (padWithZero(endDateTime.getMinute()));
    java.time.LocalDateTime newEnd = java.time.LocalDateTime.parse(((newEndDate + " ") + oldEndTime), shared.task.DTFormatter);
    if (newEnd.isBefore(this.startDateTime)) {
        throw new java.lang.IllegalArgumentException("Invalid: Start date time must be before End date time!");
    }
    this.endDateTime = newEnd;
}