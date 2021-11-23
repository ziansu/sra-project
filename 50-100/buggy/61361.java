@org.testng.annotations.Test
@com.automation.remarks.video.annotations.Video
public void shouldBeOneRecordingOnTestFail() {
    org.testng.ITestResult result = prepareMock(testMethod);
    com.automation.remarks.testng.VideoListener listener = new com.automation.remarks.testng.VideoListener();
    listener.onTestStart(result);
    listener.onTestFailure(result);
    java.io.File file = com.automation.remarks.video.recorder.monte.MonteRecorder.getLastRecording();
    org.testng.Assert.assertTrue(file.exists());
}