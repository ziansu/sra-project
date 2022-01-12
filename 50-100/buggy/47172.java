@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.basic);
    if ((sharedPrefs) == null) {
        sharedPrefs = getSharedPreferences(Keys.PREFS_NAME, Context.MODE_PRIVATE);
    }
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    com.evansappwriter.photogallery.util.Utils.setStrictMode(true);
}