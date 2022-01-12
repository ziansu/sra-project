public void copyMutableFieldsTo(com.haayhappen.clockplus.alarms.Alarm target) {
    target.setId(this.getId());
    target.snoozingUntilMillis = this.snoozingUntilMillis;
    target.enabled = this.enabled;
    java.lang.System.arraycopy(this.recurringDays, 0, target.recurringDays, 0, com.haayhappen.clockplus.alarms.misc.DaysOfWeek.NUM_DAYS);
    target.ignoreUpcomingRingTime = this.ignoreUpcomingRingTime;
}