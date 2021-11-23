@java.lang.Override
public void run() {
    try {
        while (!(shutdown)) {
            scanHandleOperationTimeout();
            if (!(shutdown)) {
                backPressureService.cleanup();
            }
            if (!(shutdown)) {
                sleep();
            }
        } 
    } catch (java.lang.Throwable t) {
        com.hazelcast.instance.OutOfMemoryErrorDispatcher.inspectOutputMemoryError(t);
        logger.severe("Failed to run", t);
    }
}