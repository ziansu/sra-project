public boolean canSuspend() {
    if (isTerminated())
        return false;
    
    return !(isSuspended());
}