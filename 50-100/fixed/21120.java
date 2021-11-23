public int getFailed() {
    long total = 0;
    long failed = 0;
    for (java.util.Iterator<org.zeroturnaround.stats.model.RunStats> ite = runStats.iterator(); ite.hasNext();) {
        org.zeroturnaround.stats.model.RunStats stats = ((org.zeroturnaround.stats.model.RunStats) (ite.next()));
        failed += stats.getFailedCount();
        total++;
    }
    if (total > 0)
        return ((int) ((100 * failed) / total));
    else
        return 0;
    
}