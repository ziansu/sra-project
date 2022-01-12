@java.lang.Override
public int getThreadCount() {
    if ((threadCount) <= 0)
        return getDefaultThreadCount();
    
    return threadCount;
}