@java.lang.Override
public void run() {
    try {
        while (!(shutdown)) {
            scanHandleOperationTimeout();
            backPressureService.cleanup();
            sleep();
        } 
    } catch (java.lang.Throwable t) {
        com.hazelcast.instance.OutOfMemoryErrorDispatcher.inspectOutputMemoryError(t);
        logger.severe("Failed to run", t);
    }
}