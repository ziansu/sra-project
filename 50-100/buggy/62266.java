@org.junit.Test
public void testTableMetadata() {
    org.junit.Assert.assertEquals(AtlasDbConstants.GENERIC_TABLE_METADATA.length, keyValueService.getMetadataForTable(com.palantir.atlasdb.keyvalue.impl.AbstractAtlasDbKeyValueServiceTest.TEST_TABLE).length);
    keyValueService.putMetadataForTable(com.palantir.atlasdb.keyvalue.impl.AbstractAtlasDbKeyValueServiceTest.TEST_TABLE, ArrayUtils.EMPTY_BYTE_ARRAY);
    org.junit.Assert.assertEquals(0, keyValueService.getMetadataForTable(com.palantir.atlasdb.keyvalue.impl.AbstractAtlasDbKeyValueServiceTest.TEST_TABLE).length);
    keyValueService.putMetadataForTable(com.palantir.atlasdb.keyvalue.impl.AbstractAtlasDbKeyValueServiceTest.TEST_TABLE, com.palantir.atlasdb.keyvalue.impl.AbstractAtlasDbKeyValueServiceTest.metadata0);
    org.junit.Assert.assertTrue(java.util.Arrays.equals(com.palantir.atlasdb.keyvalue.impl.AbstractAtlasDbKeyValueServiceTest.metadata0, keyValueService.getMetadataForTable(com.palantir.atlasdb.keyvalue.impl.AbstractAtlasDbKeyValueServiceTest.TEST_TABLE)));
}