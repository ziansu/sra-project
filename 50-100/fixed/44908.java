private void saveVideo(org.testng.ITestResult result, com.aventstack.extentreports.ExtentTest test) {
    com.mh.ta.core.annotation.RecordVideo record = getAnnotationTestMethod(result, com.mh.ta.core.annotation.RecordVideo.class);
    com.mh.ta.support.ReportListener.recordStorage.get().stopRecording();
    com.mh.ta.enums.TestStatus status = record.saveOnTestStatus();
    boolean saveAll = status == (com.mh.ta.enums.TestStatus.ALL);
    boolean saveByCorrectStatus = (com.mh.ta.enums.TestStatus.getTestStatusCode(status)) != (result.getStatus());
    storageVideoProcessing(saveAll, saveByCorrectStatus, test);
}