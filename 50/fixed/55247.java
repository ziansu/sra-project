public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1)
        return true;
    
    if (isInitialized == 0)
        return false;
    
    memoizedIsInitialized = 1;
    return true;
}