@java.lang.Override
public void onTabAdded(io.xdevs23.cornowser.browser.browser.modules.tabs.Tab tab) {
    updateStuff();
    CornBrowser.publicWebRender.load(tab.getUrl());
}