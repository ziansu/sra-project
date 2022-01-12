@org.junit.Test(expected = java.lang.RuntimeException.class)
public void brokenNetwork() throws java.io.IOException {
    com.upplication.s3fs.util.AmazonS3ClientMock client = com.upplication.s3fs.util.AmazonS3MockFactory.getAmazonClientMock();
    org.mockito.Mockito.doThrow(new java.lang.RuntimeException("network broken")).when(client).getObject("buck", "file2");
    com.upplication.s3fs.S3Path file2 = ((com.upplication.s3fs.S3Path) (java.nio.file.FileSystems.getFileSystem(com.upplication.s3fs.S3_GLOBAL_URI).getPath("/buck/file2")));
    com.upplication.s3fs.S3SeekableByteChannel channel = new com.upplication.s3fs.S3SeekableByteChannel(file2, java.util.EnumSet.of(java.nio.file.StandardOpenOption.WRITE, java.nio.file.StandardOpenOption.READ));
    channel.close();
}