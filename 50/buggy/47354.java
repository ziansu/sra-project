@java.lang.Override
public void run() {
    try {
        doWork();
    } catch (java.lang.Exception e) {
        com.flightstats.hub.group.CallbackQueue.logger.warn(("unexpected issue with " + (channel)), e);
    }
}