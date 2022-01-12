public long get() {
    final java.util.List<hudson.plugins.performance.UriReport> uriReports = performanceReport.getUriListOrdered();
    if (uriReports.isEmpty())
        return 0L;
    
    long sumThroughput = 0;
    for (hudson.plugins.performance.UriReport uriReport : uriReports)
        sumThroughput += new hudson.plugins.performance.ThroughputUriReport(uriReport).get();
    
    return sumThroughput;
}