private void setupMainWindowDisplayMode() {
    startLockTask();
    mIsKioskEnabled = true;
    android.view.View decorView = setSystemUiVisilityMode();
    decorView.setOnSystemUiVisibilityChangeListener(new android.view.View.OnSystemUiVisibilityChangeListener() {
        @java.lang.Override
        public void onSystemUiVisibilityChange(int visibility) {
            setSystemUiVisilityMode();
        }
    });
}