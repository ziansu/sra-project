public void taskAborted(diskCacheV111.util.PnfsId pnfsId, java.util.Set<java.lang.String> triedSources, int retried, int maxRetries, java.lang.Exception e) {
    if (retried >= maxRetries) {
        e = new java.lang.Exception(java.lang.String.format(("Maximum number of attempts " + "(%s) has been reached"), maxRetries), e);
    }
    org.dcache.resilience.handlers.FileTaskCompletionHandler.LOGGER.trace(org.dcache.alarms.AlarmMarkerFactory.getMarker(PredefinedAlarm.FAILED_REPLICATION, pnfsId.toString()), org.dcache.resilience.handlers.FileTaskCompletionHandler.ABORT_REPLICATION_LOG_MESSAGE, pnfsId, triedSources, new org.dcache.resilience.util.ExceptionMessage(e));
}