public void getSearchList(final java.lang.String key) {
    if (android.text.TextUtils.isEmpty(key))
        return ;
    
    mTimer.cancel();
    mTimer = new java.util.Timer();
    mTimer.schedule(new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            getSearchListAfterDelay(key);
        }
    }, nich.work.aequorea.presenter.MainPresenter.INSTANT_SEARCH_DELAY);
}