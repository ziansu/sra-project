private static org.joda.time.DateTime getEndDate(org.quartz.Trigger trigger) {
    return (trigger.getEndTime()) == null ? null : new org.joda.time.DateTime(trigger.getEndTime());
}