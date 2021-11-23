@org.junit.Test
public void successBatchProcessingTest() {
    com.eggnine.api.batchprocessing.BatchProcessor<B> batchProcessor = getBatchProcessor();
    com.eggnine.api.batchprocessing.BatchFilter<B> noReturnsFilter = new com.eggnine.api.batchprocessing.BatchFilterTest<B>().getBatchFilter();
    java.util.Map<B, java.util.Collection<com.eggnine.api.batchprocessing.TriggerValidationFailure>> results = batchProcessor.triggerBatchProcessing(noReturnsFilter);
    java.util.List<java.util.Collection<com.eggnine.api.batchprocessing.TriggerValidationFailure>> invalidResults = new java.util.ArrayList<>();
    invalidResults.addAll(results.values());
    assert invalidResults.isEmpty();
}