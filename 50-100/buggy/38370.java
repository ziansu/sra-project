@org.junit.Test
public void testCreateFileWithIncorrectContentType() throws java.io.IOException {
    assumeNotWindows();
    assumeNotOsx();
    org.innovateuk.ifs.file.resource.FileEntryResource fileResource = org.innovateuk.ifs.file.builder.FileEntryResourceBuilder.newFileEntryResource().with(org.innovateuk.ifs.base.amend.BaseBuilderAmendFunctions.id(null)).withFilesizeBytes(17).withMediaType("application/pdf").build();
    org.innovateuk.ifs.commons.service.ServiceResult<org.apache.commons.lang3.tuple.Pair<java.io.File, org.innovateuk.ifs.file.domain.FileEntry>> result = service.createFile(fileResource, fakeInputStreamSupplier());
    assertTrue(result.isFailure());
    assertTrue(result.getFailure().is(org.innovateuk.ifs.file.transactional.FILES_INCORRECTLY_REPORTED_MEDIA_TYPE, "text/plain"));
}