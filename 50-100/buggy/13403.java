private void layoutClockSaver() {
    setClockStyle();
    android.view.View contentView = ((android.view.View) (mSaverView.getParent()));
    contentView.forceLayout();
    mSaverView.forceLayout();
    mSaverView.setAlpha(0);
    mMoveSaverRunnable.registerViews(contentView, mSaverView);
    ca.mlaflamme.clocktime.Utils.hideSystemUiAndRetry(contentView);
    ca.mlaflamme.clocktime.Utils.refreshAlarm(this, contentView);
}