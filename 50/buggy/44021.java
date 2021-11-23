public int getThreadCount() {
    if ((threadCount) <= 0)
        threadCount = getDefaultThreadCount();
    
    return threadCount;
}