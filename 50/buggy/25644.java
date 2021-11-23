@java.lang.Override
protected void onResume() {
    super.onResume();
    sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    this.getWindow().addFlags(((WindowManager.LayoutParams.FLAG_FULLSCREEN) | (WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)));
    displayTimeRemaining();
}