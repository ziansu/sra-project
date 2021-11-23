@org.junit.Test
public void testTableMetadata() {
    org.junit.Assert.assertEquals(AtlasDbConstants.GENERIC_TABLE_METADATA.length, keyValueService.getMetadataForTable(com.palantir.atlasdb.keyvalue.impl.AbstractAtlasDbKeyValueServiceTest.TEST_TABLE).length);
    keyValueService.putMetadataForTable(com.palantir.atlasdb.keyvalue.impl.AbstractAtlasDbKeyValueServiceTest.TEST_TABLE, ArrayUtils.EMPTY_BYTE_ARRAY);
    org.junit.Assert.assertEquals(0, keyValueService.getMetadataForTable(com.palantir.atlasdb.keyvalue.impl.AbstractAtlasDbKeyValueServiceTest.TEST_TABLE).length);
    keyValueService.putMetadataForTable(com.palantir.atlasdb.keyvalue.impl.AbstractAtlasDbKeyValueServiceTest.TEST_TABLE, AtlasDbConstants.GENERIC_TABLE_METADATA);
    org.junit.Assert.assertTrue(java.util.Arrays.equals(AtlasDbConstants.GENERIC_TABLE_METADATA, keyValueService.getMetadataForTable(com.palantir.atlasdb.keyvalue.impl.AbstractAtlasDbKeyValueServiceTest.TEST_TABLE)));
}