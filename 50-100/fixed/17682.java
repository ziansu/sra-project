@java.lang.Override
public void stop(final org.osgi.framework.BundleContext context) throws java.lang.Exception {
    logSafely(LogService.LOG_INFO, java.lang.String.format("OSGI bundle = %s received STOP command", context.getBundle().getSymbolicName()));
    if ((restartFuture) != null) {
        restartFuture.cancel(true);
    }
    stopAllButRestartMechanism(context);
}