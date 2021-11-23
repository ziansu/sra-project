private void verifyTypeDefs(org.apache.atlas.repository.impexp.ZipSource zipSource) throws org.apache.atlas.exception.AtlasBaseException {
    org.junit.Assert.assertEquals(zipSource.getTypesDef().getEnumDefs().size(), 1);
    org.junit.Assert.assertEquals(zipSource.getTypesDef().getClassificationDefs().size(), 0);
    org.junit.Assert.assertEquals(zipSource.getTypesDef().getStructDefs().size(), 1);
    org.junit.Assert.assertEquals(zipSource.getTypesDef().getEntityDefs().size(), 4);
}