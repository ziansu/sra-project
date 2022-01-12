@java.lang.Override
public void start() {
    java.lang.String time = config().get(org.apache.brooklyn.policy.action.TIME);
    org.apache.brooklyn.util.time.Duration wait = config().get(org.apache.brooklyn.policy.action.WAIT);
    if (time != null) {
        org.apache.brooklyn.policy.action.ScheduledEffectorPolicy.LOG.debug("{}: Scheduling {} at {} (in {})", new java.lang.Object[]{ this , effector.getName() , time , org.apache.brooklyn.util.time.Time.fromDurationToTimeStringRounded().apply(wait) });
        wait = getWaitUntil(time);
    }
    if (wait != null) {
        schedule(wait);
    }
}