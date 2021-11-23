@org.junit.Test
public void fileCompressedAndDecompressedDoesNotChangeItsContent() throws java.io.IOException {
    java.lang.String sampleContent = "Hello World!";
    createFileWithContent(testFilePath, sampleContent);
    compressor.compressFolder(tempFolderPath, compresssedFilePath);
    compressor.decompressFile(compresssedFilePath, decompressedFolderPath);
    java.lang.String contentOfdecompressedFile = readFile(decompressedFilePath);
    org.junit.Assert.assertEquals(contentOfdecompressedFile, sampleContent);
}