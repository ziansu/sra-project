protected void log(int fsAddr, org.apache.uima.cas.impl.FSIndexRepositoryImpl view, int count) {
    if (org.apache.uima.cas.impl.FSsTobeAddedback.SHOW) {
        log(fsAddr, view);
        java.lang.System.out.format(",  count = %d%n", count);
    }
}