@org.jetbrains.annotations.NotNull
@java.lang.Override
protected org.robovm.idea.running.ProcessHandler startProcess() throws com.intellij.execution.ExecutionException {
    try {
        if (getEnvironment().getExecutor().getId().equals(RoboVmRunner.RUN_EXECUTOR)) {
            return executeRun();
        }else
            if (getEnvironment().getExecutor().getId().equals(RoboVmRunner.DEBUG_EXECUTOR)) {
                return executeRun();
            }else {
                return null;
            }
        
    } catch (java.lang.Throwable t) {
        org.robovm.idea.RoboVmPlugin.logErrorThrowable("Couldn't start application", t, true);
        return null;
    }
}