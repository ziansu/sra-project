public void setQueueIdle() {
    if (!(queueActive))
        return ;
    
    queueIdleTime = java.lang.System.currentTimeMillis();
}