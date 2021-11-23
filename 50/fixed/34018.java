private void testGetS3ObjectWithFlag(boolean deleteIfExists) throws java.lang.Exception {
    org.pentaho.s3.vfs.S3FileObject s3FileObject = new org.pentaho.s3.vfs.S3FileObject(filename, fileSystemSpy);
    org.jets3t.service.model.S3Object s3Object = s3FileObject.getS3Object(deleteIfExists, false);
    assertNotNull(s3Object);
}