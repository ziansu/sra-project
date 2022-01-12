@java.lang.Override
public void onBackPressed() {
    if (((io.xdevs23.cornowser.browser.CornBrowser.browserInputBar) != null) && (io.xdevs23.cornowser.browser.CornBrowser.browserInputBar.hasFocus())) {
        io.xdevs23.cornowser.browser.CornBrowser.browserInputBar.clearFocus();
        io.xdevs23.cornowser.browser.CornBrowser.applyInsideOmniText();
        return ;
    }
    if (!(io.xdevs23.cornowser.browser.CornBrowser.publicWebRender.goBack()))
        endApplication();
    
}