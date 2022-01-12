private void makeFullScreen() {
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    if (actionBar != null)
        actionBar.hide();
    
}