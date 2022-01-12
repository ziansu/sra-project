@org.junit.Test
public void testNoPreviewFileHandleAvailable() {
    org.sagebionetworks.repo.model.file.S3FileHandle fh = new org.sagebionetworks.repo.model.file.S3FileHandle();
    fh.setId("previewFileId");
    fh.setContentType("image/png");
    fh.setFileName("preview.png");
    testFileHandleList.add(fh);
    previewWidget.configure(testBundle);
    previewWidget.asWidget();
    org.mockito.Mockito.verify(mockView, org.mockito.Mockito.times(0)).setImagePreview(org.mockito.Matchers.anyString(), org.mockito.Matchers.anyString());
}