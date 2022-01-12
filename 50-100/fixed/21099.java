@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String creatorPackage = org.chromium.base.ApiCompatibilityUtils.getCreatorPackage(params.getPendingIntent());
    if ((mIntentDataProvider.isOpenedByChrome()) && (android.text.TextUtils.equals(getPackageName(), creatorPackage))) {
        org.chromium.base.metrics.RecordUserAction.record("TaskManagement.OpenInChromeActionButtonClicked");
        if (openCurrentUrlInBrowser(false))
            finish();
        
    }else {
        mIntentDataProvider.sendButtonPendingIntentWithUrl(getApplicationContext(), getActivityTab().getUrl());
        org.chromium.base.metrics.RecordUserAction.record("CustomTabsCustomActionButtonClick");
    }
}