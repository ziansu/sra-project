@org.springframework.test.annotation.DirtiesContext
@org.junit.Test
public void storeDataRecordMetaDataWithNoID() {
    nl.dtl.fairmetadata4j.model.DataRecordMetadata metadata = nl.dtls.fairdatapoint.utils.ExampleFilesUtils.getDataRecordMetadata(TEST_DATARECORD_URI, ExampleFilesUtils.DATASET_URI);
    metadata.setIdentifier(null);
    try {
        fairMetaDataService.storeDataRecordMetaData(metadata);
        nl.dtl.fairmetadata4j.model.DataRecordMetadata mdata = fairMetaDataService.retrieveDataRecordMetadata(valueFactory.createIRI(TEST_DATARECORD_URI));
        org.junit.Assert.assertNotNull(mdata.getIdentifier());
    } catch (java.lang.Exception ex) {
        org.junit.Assert.fail("This test is not excepted to throw any error");
    }
}