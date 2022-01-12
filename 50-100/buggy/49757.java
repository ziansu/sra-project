public T getOrTimeoutAfterSeconds(float seconds) throws com.databasesandlife.util.Future.FutureComputationTimedOutException {
    try {
        thread.join(((int) (1000000 * seconds)));
    } catch (java.lang.InterruptedException e) {
        throw new java.lang.RuntimeException(e);
    }
    if (((result) == null) && ((exception) == null))
        throw new com.databasesandlife.util.Future.FutureComputationTimedOutException();
    
    if ((exception) != null)
        throw new java.lang.RuntimeException(exception);
    
    return result;
}