@org.junit.Test
public void testDeleteFileButNoFileEntryExistsInDatabase() throws java.io.IOException {
    when(fileEntryRepository.findOne(456L)).thenReturn(null);
    org.innovateuk.ifs.commons.service.ServiceResult<org.innovateuk.ifs.file.domain.FileEntry> result = service.deleteFile(456L);
    assertNotNull(result);
    assertTrue(result.isFailure());
    assertTrue(result.getFailure().is(notFoundError(org.innovateuk.ifs.file.domain.FileEntry.class, 456L)));
    verify(fileEntryRepository).findOne(456L);
}