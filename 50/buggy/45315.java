@android.annotation.SuppressLint(value = "InlinedApi")
private void show() {
    mContentView.setSystemUiVisibility(((android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)));
    mVisible = true;
    mHideHandler.removeCallbacks(mHidePart2Runnable);
    mHideHandler.postDelayed(mShowPart2Runnable, com.fireteam.loupsgarous.MainActivity.UI_ANIMATION_DELAY);
}