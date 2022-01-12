@org.junit.Test
public void test_dropTable() {
    org.mockito.Mockito.when(metadataMapper.apply(org.mockito.Matchers.any())).thenReturn(hiveTable);
    org.trustedanalytics.datasetpublisher.boundary.Metadata metadata = new org.trustedanalytics.datasetpublisher.boundary.Metadata();
    metadata.setOrgUUID("cccccf34-f597-4634-8dd2-1875c06b9c4c");
    sut.dropTable(metadata);
    org.mockito.Mockito.verify(hiveService, org.mockito.Mockito.times(1)).dropTable(org.mockito.Matchers.any(), org.mockito.Matchers.any());
}