public void downloadWithoutSearch(final java.lang.String urlOfWebsite, final java.lang.String name) {
    android.util.Log.d(internetofeveryone.ioe.Browser.BrowserPresenter.TAG, ("Url passed: " + urlOfWebsite));
    this.name = name;
    url = urlOfWebsite;
    new internetofeveryone.ioe.Browser.BrowserPresenter.Connect().execute("");
    if ((tcpClient) != null) {
        tcpClient.sendMessage((("WEBREQU " + urlOfWebsite) + ""));
    }
}