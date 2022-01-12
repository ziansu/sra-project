public void writeResultsToDB() {
    stats.write = true;
    long before = java.lang.System.currentTimeMillis();
    java.lang.System.out.println("Writing back");
    apoc.algo.algorithms.AlgoUtils.writeBackResults(pool, db, this, apoc.algo.pagerank.PageRankArrayStorageParallelCypher.WRITE_BATCH);
    stats.writeMillis = (java.lang.System.currentTimeMillis()) - before;
    stats.property = getPropertyName();
}