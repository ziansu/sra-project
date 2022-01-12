@java.lang.Override
public void markTabStateInitialized() {
    super.markTabStateInitialized();
    if (!(mSessionRestoreInProgress.getAndSet(false)))
        return ;
    
    org.chromium.chrome.browser.tabmodel.TabModelImpl model = ((org.chromium.chrome.browser.tabmodel.TabModelImpl) (getModel(false)));
    if (model != null) {
        model.broadcastSessionRestoreComplete();
    }else {
        assert false : "Normal tab model is null after tab state loaded.";
    }
}