@org.junit.Test
public void createRelease() {
    tester.clickButton("Create Release");
    tester.insertInput("version", ReleaseTest.VERSION_NUMBER);
    tester.insertInput("releaseDate", ReleaseTest.RELEASE_DATE);
    tester.clickFirstNonEmptySelect("releaseCreateUpdateCtrl.data.supportLevel");
    tester.insertInput("downloadurl", ReleaseTest.DOWNLOAD_URL);
    tester.submit();
    tester.findSpan("1.0.1.15");
    tester.takeScreenshot();
}