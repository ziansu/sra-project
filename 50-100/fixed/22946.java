private java.util.List<hudson.plugins.cobertura.targets.CoverageMetric> findEmptyMetrics(java.util.Map<hudson.plugins.cobertura.targets.CoverageMetric, hudson.plugins.cobertura.Ratio> currMetricSet) {
    java.util.List<hudson.plugins.cobertura.targets.CoverageMetric> allMetrics = new java.util.LinkedList<hudson.plugins.cobertura.targets.CoverageMetric>(java.util.Arrays.asList(CoverageMetric.PACKAGES, CoverageMetric.FILES, CoverageMetric.CLASSES, CoverageMetric.METHOD, CoverageMetric.LINE, CoverageMetric.CONDITIONAL));
    java.util.List<hudson.plugins.cobertura.targets.CoverageMetric> missingMetrics = new java.util.LinkedList<hudson.plugins.cobertura.targets.CoverageMetric>();
    for (hudson.plugins.cobertura.targets.CoverageMetric currMetric : allMetrics) {
        if (!(currMetricSet.containsKey(currMetric))) {
            missingMetrics.add(currMetric);
        }
    }
    return missingMetrics;
}