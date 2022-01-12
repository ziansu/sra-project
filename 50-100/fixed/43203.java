public void execute() {
    for (java.lang.String tc = commandCache.getNextTestCase(); tc != null; tc = commandCache.getNextTestCase()) {
        if (de.fraunhofer.iosb.ivct.RuntimeParameters.getAbortTestScheduleBool()) {
            break;
        }
        ivctCommander.rtp.startTestCase(commandCache.getTestschedule(), tc);
        this.ivctCommander.acquireSemaphore();
    }
    ivctCommander.addTestSessionSeparator();
    de.fraunhofer.iosb.ivct.RuntimeParameters.setAbortTestScheduleBool(false);
    ivctCommander.rtp.setTestScheduleRunningBool(false);
    java.lang.System.out.println(("Test schedule finished: " + (commandCache.getTestschedule())));
}