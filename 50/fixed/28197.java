public void shutDownLiveThreads() {
    if ((executor) == null)
        return ;
    
    boolean isTerminated = executor.isTerminated();
    while (!isTerminated) {
        executor.shutdownNow();
        isTerminated = executor.isTerminated();
    } 
}