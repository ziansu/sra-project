@java.lang.SuppressWarnings(value = "unused")
@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onNewSiteCreated(org.wordpress.android.fluxc.store.SiteStore.OnNewSiteCreated event) {
    org.wordpress.android.util.AppLog.i(T.NUX, event.toString());
    if (event.isError()) {
        endProgress();
        org.wordpress.android.analytics.AnalyticsTracker.track(AnalyticsTracker.Stat.CREATE_ACCOUNT_FAILED);
        showSiteError(event.error.message);
        return ;
    }
    if (event.dryRun) {
        updateProgress(getString(R.string.creating_your_account));
        mNewSitePayload.dryRun = false;
        mNewAccountPayload.dryRun = false;
        mDispatcher.dispatch(org.wordpress.android.fluxc.generated.AccountActionBuilder.newCreateNewAccountAction(mNewAccountPayload));
        return ;
    }
    fetchSiteAndAccount();
}