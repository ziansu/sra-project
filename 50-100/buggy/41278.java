@hugo.weaving.DebugLog
private void startPlayer(java.lang.String location) {
    if ((mHasSubs) && ((mSubsStatus) == (pct.droid.base.fragments.BaseStreamLoadingFragment.SubsStatus.DOWNLOADING))) {
        pct.droid.base.utils.ThreadUtils.runOnUiThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                setState(pct.droid.base.fragments.BaseStreamLoadingFragment.State.WAITING_SUBTITLES);
            }
        });
        return ;
    }
    if (!(mPlayerStarted)) {
        mPlayerStarted = true;
        mService.removeListener(this);
        startPlayerActivity(location, 0);
    }
}