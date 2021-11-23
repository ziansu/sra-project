private void verifyTypeDefs(org.apache.atlas.repository.impexp.ZipSource zipSource) throws org.apache.atlas.exception.AtlasBaseException {
    assertEquals(zipSource.getTypesDef().getEnumDefs().size(), 1);
    assertEquals(zipSource.getTypesDef().getClassificationDefs().size(), 0);
    assertEquals(zipSource.getTypesDef().getStructDefs().size(), 1);
    assertEquals(zipSource.getTypesDef().getEntityDefs().size(), 4);
}