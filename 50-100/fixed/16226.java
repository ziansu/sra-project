protected void playFileAsLocal(org.kurento.test.client.Browser browserType, java.lang.String recordingFile, int playtime, int x, int y, java.awt.Color... expectedColors) throws java.lang.InterruptedException {
    try (org.kurento.test.client.BrowserClient browser = new org.kurento.test.client.BrowserClient.Builder().browser(browserType).client(Client.WEBRTC).local().build()) {
        browser.subscribeEvents("playing");
        browser.playUrlInVideoTag(recordingFile, VideoTagType.REMOTE);
        makeAssertions("[played as local file]", browser, playtime, x, y, null, expectedColors);
    }
}