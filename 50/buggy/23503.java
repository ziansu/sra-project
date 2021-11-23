@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    if (getResources().getConfiguration().isLayoutSizeAtLeast(Configuration.SCREENLAYOUT_SIZE_LARGE))
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    
    setContentView(R.layout.activity_splash);
}