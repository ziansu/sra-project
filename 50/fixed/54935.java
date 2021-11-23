@org.junit.Test
public void testUploadFileToBlobStorage() {
    if (execute) {
        boolean uploadedFileToBlobStorage = storageService.uploadFileToBlobStorage(xlfFilePath, "unit-tests", fileId, fileName);
        org.junit.Assert.assertTrue(uploadedFileToBlobStorage);
    }
}