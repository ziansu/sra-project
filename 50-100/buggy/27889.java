public int getActiveThreads() {
    if (((pool.size()) < (threads.length)) && (5000 < ((lastCount) - (java.lang.System.currentTimeMillis())))) {
        lastCount = java.lang.System.currentTimeMillis();
        int count = 0;
        for (java.lang.Thread t : threads) {
            if (t.isAlive()) {
                count++;
            }
        }
        activeThreads = count;
    }
    return activeThreads;
}