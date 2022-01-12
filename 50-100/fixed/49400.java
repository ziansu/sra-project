@org.junit.Test
public void testResolveAnnotationsFilePath() {
    assertNull(domainRepositorySpy.resolveAnnotationsFilePath(null));
    java.lang.String domainFileId = "00000000";
    java.lang.String annotationsId = domainFileId + (IModelAnnotationsAwareMetadataDomainRepositoryImporter.ANNOTATIONS_FILE_ID_POSTFIX);
    org.pentaho.platform.api.repository2.unified.RepositoryFile domainFile = mock(org.pentaho.platform.api.repository2.unified.RepositoryFile.class);
    doReturn(domainFileId).when(domainFile).getId();
    assertEquals(("/etc/metadata/" + annotationsId), domainRepositorySpy.resolveAnnotationsFilePath(domainFile));
}