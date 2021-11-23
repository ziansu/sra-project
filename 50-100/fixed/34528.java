public java.lang.Integer getNextMatch(int currentHour) {
    if ((this.scheduleExpressionType) == (org.jboss.as.ejb3.timerservice.schedule.value.ScheduleExpressionType.WILDCARD)) {
        return currentHour;
    }
    if (this.absoluteValues.isEmpty()) {
        return null;
    }
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