@java.lang.Override
public void start() {
    if (!(isEnabled())) {
        return ;
    }
    if (!(isRunning())) {
        register();
        getContext().publishEvent(new org.springframework.cloud.client.discovery.event.InstanceRegisteredEvent(this, getConfiguration()));
        running.compareAndSet(false, true);
    }
}