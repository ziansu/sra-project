@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_host_event);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    getSupportActionBar().setDisplayShowTitleEnabled(false);
    int screenSize = (getResources().getConfiguration().screenLayout) & (android.content.res.Configuration.SCREENLAYOUT_SIZE_MASK);
    if ((screenSize == (android.content.res.Configuration.SCREENLAYOUT_SIZE_LARGE)) || (screenSize == (android.content.res.Configuration.SCREENLAYOUT_SIZE_XLARGE)))
        if (phoneDevice)
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
    
}