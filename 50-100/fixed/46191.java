public void setupTabs(@android.support.annotation.Nullable
android.content.Intent intent, boolean isIncognito) {
    mTabsModel.initializeTabs(((android.app.Activity) (mView)), intent, isIncognito).subscribe(new acr.browser.lightning.react.OnSubscribe<java.lang.Void>() {
        @java.lang.Override
        public void onComplete() {
            tabChanged(mTabsModel.last());
            mView.updateTabNumber(mTabsModel.size());
        }
    });
}