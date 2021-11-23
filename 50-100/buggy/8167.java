@org.junit.Test
public void deleteBucket() throws java.lang.Exception {
    final java.lang.String bucket = "bucket-to-delete";
    createBucketRestCall(bucket);
    alluxio.AlluxioURI uri = new alluxio.AlluxioURI(((alluxio.AlluxioURI.SEPARATOR) + bucket));
    org.junit.Assert.assertTrue(mFileSystemMaster.listStatus(uri, alluxio.master.file.options.ListStatusOptions.defaults()).isEmpty());
    deleteBucketRestCall(bucket);
    try {
        mFileSystemMaster.getFileInfo(uri, alluxio.proxy.s3.S3ClientRestApiTest.GET_STATUS_OPTIONS);
        org.junit.Assert.fail("bucket should have been removed");
    } catch (alluxio.exception.FileDoesNotExistException e) {
    }
}