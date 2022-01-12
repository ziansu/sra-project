@java.lang.Override
public void onDismissNoAction(java.lang.Object actionData) {
    if (actionData == null)
        return ;
    
    org.chromium.chrome.browser.offlinepages.OfflinePageUtils.SnackbarButtonType buttonType = ((org.chromium.chrome.browser.offlinepages.OfflinePageUtils.SnackbarButtonType) (actionData));
    switch (buttonType) {
        case NONE :
            break;
        case RELOAD :
            org.chromium.base.metrics.RecordUserAction.record("OfflinePages.ReloadButtonNotClicked");
            break;
        case SAVE :
            org.chromium.base.metrics.RecordUserAction.record("OfflinePages.SaveButtonNotClicked");
            break;
        default :
            assert false;
            break;
    }
}