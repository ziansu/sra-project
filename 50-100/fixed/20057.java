@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    app = com.defch.blogwbly.MyApplication.getInstance();
    theme = app.getWTheme();
    theme.applyTheme(getTheme());
    super.onCreate(savedInstanceState);
    mIsLandscape = (getResources().getConfiguration().orientation) == (android.content.res.Configuration.ORIENTATION_LANDSCAPE);
    mIsTablet = getResources().getBoolean(R.bool.is_tablet);
}