@org.junit.Test(expected = java.nio.file.FileAlreadyExistsException.class)
public void alreadyExists() throws java.io.IOException {
    com.upplication.s3fs.util.AmazonS3ClientMock client = com.upplication.s3fs.util.AmazonS3MockFactory.getAmazonClientMock();
    client.bucket("buck").file("file1");
    com.upplication.s3fs.S3Path file1 = ((com.upplication.s3fs.S3Path) (java.nio.file.FileSystems.getFileSystem(S3EndpointConstant.S3_GLOBAL_URI_TEST).getPath("/buck/file1")));
    com.upplication.s3fs.S3SeekableByteChannel channel = new com.upplication.s3fs.S3SeekableByteChannel(file1, java.util.EnumSet.of(java.nio.file.StandardOpenOption.WRITE, java.nio.file.StandardOpenOption.CREATE_NEW));
    org.junit.Assert.assertNotNull(channel);
    channel.write(java.nio.ByteBuffer.wrap("hoi".getBytes()));
    channel.close();
}