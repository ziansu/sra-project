public int getNumberOfThreads() {
    int maxThreads = preferences.getNumberOfThreads();
    if ((maxThreads < 1) || (maxThreads > (java.lang.Runtime.getRuntime().availableProcessors()))) {
        maxThreads = computeMaxThreads();
        preferences.setNumberOfThreads(maxThreads);
    }
    return maxThreads;
}