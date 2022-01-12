@org.testng.annotations.Test
@com.automation.remarks.video.annotations.Video
public void shouldNotBeRecordingForSuccessfulTestAndSaveModeFailOnly() {
    com.automation.remarks.video.recorder.monte.MonteRecorder.conf().withVideoSaveMode(VideoSaveMode.FAILED_ONLY);
    org.testng.ITestResult result = prepareMock(testMethod);
    com.automation.remarks.testng.VideoListener listener = new com.automation.remarks.testng.VideoListener();
    listener.onTestStart(result);
    listener.onTestSuccess(result);
    java.io.File file = com.automation.remarks.video.recorder.monte.MonteRecorder.getLastRecording();
    assertFalse(file.exists());
}