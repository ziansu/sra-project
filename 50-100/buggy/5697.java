@org.junit.Test
public void testPerformTask2() throws java.lang.Exception {
    org.duracloud.s3task.streaming.EnableStreamingTaskRunner runner = createRunner(createMockStorageProviderV2(false), createMockUnwrappedS3StorageProviderV2(), createMockS3ClientV3(), createMockCFClientV2(), cfAccountId);
    org.duracloud.s3storageprovider.dto.EnableStreamingTaskParameters taskParams = new org.duracloud.s3storageprovider.dto.EnableStreamingTaskParameters();
    taskParams.setSpaceId(spaceId);
    boolean secure = true;
    taskParams.setSecure(secure);
    java.lang.String results = runner.performTask(taskParams.serialize());
    assertNotNull(results);
    testResults(results);
    testCapturedProps();
}