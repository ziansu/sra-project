@org.testng.annotations.Test
@com.automation.remarks.video.annotations.Video(enabled = false)
public void shouldNotBeRecordingIfVideoDisabled() {
    org.testng.ITestResult result = prepareMock(testMethod);
    com.automation.remarks.testng.VideoListener listener = new com.automation.remarks.testng.VideoListener();
    listener.onTestStart(result);
    listener.onTestSuccess(result);
    java.io.File file = com.automation.remarks.video.recorder.monte.MonteRecorder.getLastRecording();
    assertFalse(file.exists());
}