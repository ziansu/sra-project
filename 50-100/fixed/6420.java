private void hide() {
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    hideActionBar(actionBar);
    mControlsView.animate().translationY(mControlsView.getHeight()).setDuration(nl.jeroenhd.app.bcbreader.activities.FullscreenReaderActivity.UI_ANIMATION_DELAY).start();
    mVisible = false;
    mHideHandler.removeCallbacks(mShowPart2Runnable);
    mHideHandler.postDelayed(mHidePart2Runnable, nl.jeroenhd.app.bcbreader.activities.FullscreenReaderActivity.UI_ANIMATION_DELAY);
}