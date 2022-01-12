@org.junit.Test
public void getFileSystem() {
    java.nio.file.FileSystem fileSystem = s3fsProvider.newFileSystem(S3EndpointConstant.S3_GLOBAL_URI_TEST, com.google.common.collect.ImmutableMap.<java.lang.String, java.lang.Object>of());
    org.junit.Assert.assertNotNull(fileSystem);
    fileSystem = s3fsProvider.getFileSystem(S3EndpointConstant.S3_GLOBAL_URI_TEST, com.google.common.collect.ImmutableMap.<java.lang.String, java.lang.Object>of());
    org.junit.Assert.assertNotNull(fileSystem);
    java.nio.file.FileSystem other = s3fsProvider.getFileSystem(S3EndpointConstant.S3_GLOBAL_URI_TEST);
    org.junit.Assert.assertSame(fileSystem, other);
}