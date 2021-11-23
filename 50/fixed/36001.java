private boolean contains(java.util.List<co.cask.cdap.metrics.process.MetricRecordsWrapper.Rule> rules, co.cask.cdap.metrics.process.MetricRecordsWrapper.Rule rule) {
    for (co.cask.cdap.metrics.process.MetricRecordsWrapper.Rule candidate : rules) {
        if (contains(candidate, rule)) {
            return true;
        }
    }
    return false;
}