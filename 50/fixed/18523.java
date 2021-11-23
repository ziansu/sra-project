@java.lang.Override
public void onTabAdded(io.xdevs23.cornowser.browser.browser.modules.tabs.Tab tab) {
    CornBrowser.publicWebRender.load(tab.getUrl());
    updateStuff();
}