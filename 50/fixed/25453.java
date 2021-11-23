synchronized boolean cancel() {
    boolean result = scheduled;
    if ((entryFuture) != null)
        entryFuture.cancel(false);
    
    entryFuture = null;
    scheduled = false;
    return result;
}