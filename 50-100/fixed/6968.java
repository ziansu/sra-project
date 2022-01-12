@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.i("GameActivity", "onResume");
    if (!(mIsResumed)) {
        mIsResumed = true;
        tryRunning();
        if ((mSensorController) != null) {
            mSensorController.onResume();
        }
        mGameSidebar.setBackgroundDrawable(new paulscode.android.mupen64plusae.DrawerDrawable(mGlobalPrefs.displayActionBarTransparency));
        mMogaController.onResume();
    }
}