@java.lang.Override
public void start() {
    if (!(isEnabled())) {
        return ;
    }
    if (running.compareAndSet(false, true)) {
        register();
        getContext().publishEvent(new org.springframework.cloud.client.discovery.event.InstanceRegisteredEvent(this, getConfiguration()));
    }
}