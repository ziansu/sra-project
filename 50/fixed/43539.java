@org.apache.nifi.annotation.lifecycle.OnUnscheduled
public void shutdownExecutor() {
    try {
        executor.shutdown();
    } finally {
        this.externalProcess.destroy();
    }
}