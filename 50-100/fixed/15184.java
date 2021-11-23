private static ch.ethz.globis.tinspin.TestStats.TestStats average(int nStats) {
    int n = ch.ethz.globis.tinspin.TestManager.stats.size();
    java.util.List<ch.ethz.globis.tinspin.TestStats.TestStats> toAggregate = ch.ethz.globis.tinspin.TestManager.stats.subList((n - nStats), n);
    ch.ethz.globis.tinspin.TestStats.TestStats avg = ch.ethz.globis.tinspin.TestStats.TestStats.aggregate(toAggregate);
    return avg;
}