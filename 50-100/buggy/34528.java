public java.lang.Integer getNextMatch(java.util.Calendar currentCal) {
    if ((this.scheduleExpressionType) == (org.jboss.as.ejb3.timerservice.schedule.value.ScheduleExpressionType.WILDCARD)) {
        return currentCal.get(java.util.Calendar.HOUR_OF_DAY);
    }
    if (this.absoluteValues.isEmpty()) {
        return null;
    }
    int currentHour = currentCal.get(java.util.Calendar.HOUR_OF_DAY);
    for (java.lang.Integer hour : this.absoluteValues) {
        if (currentHour == hour) {
            return currentHour;
        }
        if (hour > currentHour) {
            return hour;
        }
    }
    return this.absoluteValues.first();
}