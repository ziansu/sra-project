@java.lang.Override
public void destroy() {
    super.destroy();
    for (java.util.Map.Entry<java.lang.Integer, org.chromium.chrome.browser.dom_distiller.ReaderModeTabInfo> e : mTabStatusMap.entrySet()) {
        if ((e.getValue().getWebContentsObserver()) != null) {
            e.getValue().getWebContentsObserver().destroy();
        }
    }
    mTabStatusMap.clear();
    org.chromium.chrome.browser.dom_distiller.DomDistillerUIUtils.destroy(this);
    mChromeActivity = null;
    mReaderModePanel = null;
    mTabModelSelector = null;
}