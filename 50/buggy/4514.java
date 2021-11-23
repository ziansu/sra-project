@org.junit.Test
public void roundTripTest() {
    org.openforis.collect.datacleansing.DataCleansingMetadata metadata = createTestMetadata();
    metadataManager.saveMetadata(survey, metadata);
    org.openforis.collect.datacleansing.DataCleansingMetadata reloadedMetadata = metadataManager.loadMetadata(survey);
    assertDeepEquals(metadata, reloadedMetadata);
}