@java.lang.Override
protected void afterExecute(java.lang.Runnable r, java.lang.Throwable t) {
    super.afterExecute(r, t);
    if (com.powsybl.commons.concurrent.CleanableExecutors.LOGGER.isTraceEnabled()) {
        com.powsybl.commons.concurrent.CleanableExecutors.LOGGER.trace("activeCount={} ,corePoolSize={} ,largestPoolSize={} ,maximumPoolSize={}", getActiveCount(), getCorePoolSize(), getLargestPoolSize(), getMaximumPoolSize());
    }
    if (t != null) {
        if (com.powsybl.commons.concurrent.CleanableExecutors.LOGGER.isErrorEnabled()) {
            com.powsybl.commons.concurrent.CleanableExecutors.LOGGER.error(t.toString(), t);
        }
    }
    for (com.powsybl.commons.concurrent.CleanableExecutors.ThreadCleaner cleaner : cleaners) {
        cleaner.clean();
    }
}