public int getNumberOfThreads() {
    int maxThreads = this.preferences.getNumberOfThreads();
    if ((maxThreads < 1) || (maxThreads > (java.lang.Runtime.getRuntime().availableProcessors()))) {
        maxThreads = computeMaxThreads();
        this.preferences.setNumberOfThreads(maxThreads);
    }
    return maxThreads;
}