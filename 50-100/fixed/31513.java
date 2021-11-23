@java.lang.Override
public void start() {
    java.lang.String time = config().get(org.apache.brooklyn.policy.action.TIME);
    org.apache.brooklyn.util.time.Duration wait = config().get(org.apache.brooklyn.policy.action.WAIT);
    if (time != null) {
        wait = getWaitUntil(time);
    }
    if (wait != null) {
        schedule(wait);
    }
}