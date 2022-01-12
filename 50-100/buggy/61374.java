@android.support.annotation.Nullable
public synchronized acr.browser.lightning.view.LightningView switchToTab(final int position) {
    if ((position < 0) || (position >= (mWebViewList.size()))) {
        android.util.Log.e(acr.browser.lightning.activity.TabsManager.TAG, ("Returning a null LightningView requested for position: " + position));
        return null;
    }else {
        final acr.browser.lightning.view.LightningView tab = mWebViewList.get(position);
        mCurrentTab = tab;
        return tab;
    }
}