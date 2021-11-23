@java.lang.Override
public void showTab(io.xdevs23.cornowser.browser.browser.modules.tabs.Tab tab) {
    org.xdevs23.debugutils.Logging.logd(("Showing tab " + (tab.tabId)));
    CornBrowser.publicWebRenderLayout.removeAllViews();
    CornBrowser.publicWebRenderLayout.addView(tab.webView);
    io.xdevs23.cornowser.browser.CornBrowser.publicWebRender = tab.webView;
    currentTab = tab.tabId;
    setLayoutTabId(currentTab, tab.tabId);
    io.xdevs23.cornowser.browser.CornBrowser.applyInsideOmniText();
    tabSwitchListener.onTabSwitched(tab);
}