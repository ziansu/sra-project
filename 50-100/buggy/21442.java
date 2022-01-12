@org.junit.Test
public void testGetFileByFileEntryIdButFileEntryEntityDoesntExist() throws java.io.IOException {
    when(fileEntryRepository.findOne(123L)).thenReturn(null);
    org.innovateuk.ifs.commons.service.ServiceResult<java.util.function.Supplier<java.io.InputStream>> result = service.getFileByFileEntryId(123L);
    assertTrue(result.isFailure());
    assertTrue(result.getFailure().is(org.innovateuk.ifs.commons.error.CommonErrors.notFoundError(org.innovateuk.ifs.file.domain.FileEntry.class, 123L)));
    verify(fileEntryRepository).findOne(123L);
}