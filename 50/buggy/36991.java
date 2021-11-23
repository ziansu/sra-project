@java.lang.Override
public boolean isScheduled(java.lang.String id) {
    for (org.grails.ignite.ScheduledRunnable scheduleDatum : org.grails.ignite.DistributedSchedulerServiceImpl.schedule) {
        if (scheduleDatum.toString().equals(id))
            return true;
        
    }
    return false;
}