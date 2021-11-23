@org.junit.Test
public void testMatchingAlgorithmMVMsCGDCallable() throws java.lang.Exception {
    java.util.Map institutionMap = new java.util.HashMap();
    org.recap.executors.MatchingAlgorithmMVMsCGDCallable matchingAlgorithmMVMsCGDCallable = new org.recap.executors.MatchingAlgorithmMVMsCGDCallable(reportDataDetailsRepository, mockedBibliographicDetailsRepository, pageNum, batchSize, producerTemplate, collectionGroupMap, institutionMap, itemChangeLogDetailsRepository, collectionGroupDetailsRepository, itemDetailsRepository);
    java.lang.Object object = matchingAlgorithmMVMsCGDCallable.call();
    assertEquals(collectionGroupId, 1);
    java.lang.Thread.sleep(1000);
    org.recap.executors.BibliographicEntity afterUpdate = bibliographicDetailsRepository.findByBibliographicId(bibliographicEntity.getBibliographicId());
    assertNotNull(afterUpdate);
}