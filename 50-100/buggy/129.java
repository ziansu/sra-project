@java.lang.Override
public void postBenchmark(nl.tudelft.graphalytics.domain.Benchmark benchmark, nl.tudelft.graphalytics.domain.BenchmarkResult benchmarkResult) {
    nl.tudelft.graphalytics.granula.GranulaPlugin.LOG.debug("Start postBenchmark in Granula");
    if (nl.tudelft.graphalytics.granula.GranulaPlugin.enabled) {
        if (nl.tudelft.graphalytics.granula.GranulaPlugin.platformLogEnabled) {
            platform.postBenchmark(benchmark, getLogDirectory(benchmark));
        }
        if (nl.tudelft.graphalytics.granula.GranulaPlugin.archivingEnabled) {
            try {
                createArchive(benchmarkResult);
                platform.enrichMetrics(benchmarkResult, getArchiveDirectory(benchmark));
            } catch (java.lang.Exception ex) {
                nl.tudelft.graphalytics.granula.GranulaPlugin.LOG.error("Failed to generate Granula archives for the benchmark results:", ex);
            }
        }
    }
}