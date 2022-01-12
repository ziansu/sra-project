private void handleCanceled(java.lang.Throwable t) {
    if (!(isInterrupted()))
        operationCanceledManager.propagateIfCancelException(t);
    
    handleCanceled();
}