public boolean shouldLogOperation(java.lang.String key, java.lang.String op) {
    if (!(isLogEventEnabled()))
        return false;
    
    if (!(logOperationCalls.get().contains(op)))
        return false;
    
    return ((key.hashCode()) % 1000) <= (logOperations.get());
}