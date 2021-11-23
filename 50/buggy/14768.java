protected void markTabStateInitialized() {
    mTabStateInitialized = true;
    for (org.chromium.chrome.browser.tabmodel.TabModelSelectorObserver listener : mObservers)
        listener.onTabStateInitialized();
    
}