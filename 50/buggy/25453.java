synchronized boolean cancel(boolean resetExpiration) {
    boolean result = scheduled;
    if ((entryFuture) != null)
        entryFuture.cancel(false);
    
    entryFuture = null;
    scheduled = false;
    if (resetExpiration)
        resetExpiration();
    
    return result;
}