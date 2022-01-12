@org.testng.annotations.Test
@com.automation.remarks.video.annotations.Video(name = "new_recording")
public void shouldBeRecordingWithCustomName() {
    org.testng.ITestResult result = prepareMock(testMethod);
    com.automation.remarks.testng.VideoListener listener = new com.automation.remarks.testng.VideoListener();
    listener.onTestStart(result);
    listener.onTestFailure(result);
    java.io.File file = com.automation.remarks.video.recorder.monte.MonteRecorder.getLastRecording();
    assertTrue(file.exists());
    assertTrue(file.getName().contains("new_recording"));
}