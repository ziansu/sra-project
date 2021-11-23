@org.junit.Test
public void successfullyExtractFileFromZipArchive() throws java.lang.Exception {
    java.lang.String extractedFilePath = unzipFile(new java.io.File(testZipFile.getFile()), tempDir, BinaryType.PHANTOMJS);
    java.io.FileInputStream fileToCheck = new java.io.FileInputStream(com.lazerycode.selenium.extract.ExtractFilesFromArchiveTest.phantomJSTestFile);
    java.lang.String downloadedFileHash = org.apache.commons.codec.digest.DigestUtils.md5Hex(fileToCheck);
    fileToCheck.close();
    org.junit.Assert.assertThat(downloadedFileHash, org.hamcrest.core.Is.is(org.hamcrest.core.IsEqual.equalTo(validHash)));
    org.junit.Assert.assertThat(extractedFilePath, org.hamcrest.core.Is.is(org.hamcrest.core.IsEqual.equalTo(((tempDir) + "/phantomjs"))));
}