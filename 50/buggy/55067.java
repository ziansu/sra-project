@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) {
        outState.putString(com.valevich.moneytracker.ui.activities.MainActivity.TOOLBAR_TITLE_KEY, java.lang.String.valueOf(actionBar.getTitle()));
    }
    super.onSaveInstanceState(outState);
}