public void setEndTime(java.lang.String newEndTime) throws java.lang.IllegalArgumentException {
    java.lang.String oldEndDate = ((((padWithZero(endDateTime.getDayOfMonth())) + " ") + (padWithZero(endDateTime.getMonthValue()))) + " ") + (endDateTime.getYear());
    java.time.LocalDateTime newEnd = java.time.LocalDateTime.parse(((oldEndDate + " ") + newEndTime), shared.task.DTFormatter);
    if (newEnd.isBefore(this.startDateTime)) {
        throw new java.lang.IllegalArgumentException("Invalid: Start date time must be before End date time!");
    }
}