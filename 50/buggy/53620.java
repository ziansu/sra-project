private java.util.List<org.apache.commons.math3.stat.descriptive.DescriptiveStatistics> initWindowedStats() {
    if ((org.apache.jmeter.visualizers.backend.SamplerMetric.WINDOW_MODE) == (WindowMode.FIXED)) {
        return java.util.Arrays.asList(okResponsesStats, koResponsesStats, allResponsesStats);
    }else {
        return java.util.Collections.emptyList();
    }
}