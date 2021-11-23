@java.lang.Override
public void stop() {
    try {
        if (isStarted) {
            sched.shutdown();
        }
    } catch (org.quartz.SchedulerException ex) {
    }
}