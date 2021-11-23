private static final void __printRealQuality(final org.optimizationBenchmarking.utils.document.spec.IMath math, final int qualityModel, final int dataModel) {
    try (final org.optimizationBenchmarking.utils.document.spec.IMath div = math.div()) {
        try (final org.optimizationBenchmarking.utils.document.spec.IMath sub = math.sub()) {
            org.optimizationBenchmarking.evaluator.attributes.clusters.behavior._BehaviorClustering.__printQuality(sub, qualityModel, dataModel);
            org.optimizationBenchmarking.evaluator.attributes.clusters.behavior._BehaviorClustering.__printQuality(sub, dataModel, dataModel);
        }
        org.optimizationBenchmarking.evaluator.attributes.clusters.behavior._BehaviorClustering.__printQuality(div, dataModel, dataModel);
    }
}