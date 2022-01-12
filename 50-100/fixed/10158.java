public void computeOutputs(org.apache.beam.runners.spark.SparkRunner.Evaluator evaluator, boolean debugPipelineMode) {
    if (debugPipelineMode && (evaluator instanceof org.apache.beam.runners.spark.SparkNativePipelineVisitor)) {
        org.apache.beam.runners.spark.translation.EvaluationContext.LOG.info(("Translated Native Spark pipeline:\n" + (((org.apache.beam.runners.spark.SparkNativePipelineVisitor) (evaluator)).getDebugString())));
    }
    for (org.apache.beam.runners.spark.translation.Dataset dataset : leaves) {
        dataset.cache(storageLevel());
        if (!debugPipelineMode) {
            dataset.action();
        }else {
            dataset.printDebugString();
        }
    }
}