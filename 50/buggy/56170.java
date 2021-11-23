@org.testng.annotations.BeforeClass(alwaysRun = true)
public void startRecord() throws java.io.IOException, java.lang.InterruptedException {
    java.lang.Runtime rt = java.lang.Runtime.getRuntime();
    rt.exec("cmd.exe /C adb shell screenrecord /sdcard/runCase.mp4");
}