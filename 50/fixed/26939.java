@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    android.support.v7.app.ActionBar actionBar = getActionBar();
    if (actionBar != null) {
        actionBar.show();
    }
}