@java.lang.Override
public void doWork(org.mule.runtime.core.api.retry.RetryContext context) throws java.lang.Exception {
    try {
        if ((source) == null) {
            createSource();
        }
        source.start();
    } catch (java.lang.Exception e) {
        stopSource();
        disposeSource();
        java.lang.Exception exception = exceptionEnricherManager.processException(e);
        java.util.Optional<org.mule.runtime.api.connection.ConnectionException> connectionException = org.mule.runtime.core.util.ExceptionUtils.extractRootConnectionException(exception);
        if (connectionException.isPresent()) {
            throw exception;
        }else {
            context.setFailed(exception);
        }
    }
}