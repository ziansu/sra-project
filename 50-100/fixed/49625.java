@java.lang.Override
public void onResume() {
    super.onResume();
    final android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) {
        if (!(mNavigationHandler.isDualPane())) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }else {
            actionBar.setHomeButtonEnabled(false);
            actionBar.setDisplayHomeAsUpEnabled(false);
        }
    }
}