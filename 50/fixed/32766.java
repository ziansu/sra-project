@java.lang.Override
public void stop() {
    try {
        if (isStarted) {
            sched.shutdown(false);
        }
    } catch (org.quartz.SchedulerException ex) {
    }
}