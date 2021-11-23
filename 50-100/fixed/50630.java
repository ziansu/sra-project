void writeStatsToFile(long epochTime, java.lang.String timestamp) {
    performanceStatsWriter.write(epochTime, timestamp, totalOperationCount, intervalOperationCount, intervalThroughput, 0, 0);
    for (java.util.Map.Entry<java.lang.String, org.HdrHistogram.Histogram> histogramEntry : intervalHistogramMap.entrySet()) {
        java.lang.String probeName = histogramEntry.getKey();
        org.HdrHistogram.HistogramLogWriter histogramLogWriter = histogramLogWriterMap.get(probeName);
        org.HdrHistogram.Histogram intervalHistogram = histogramEntry.getValue();
        histogramLogWriter.outputIntervalHistogram(intervalHistogram);
    }
}