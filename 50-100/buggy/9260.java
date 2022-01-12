private void setToolbar(android.support.v7.widget.Toolbar toolbar, java.lang.String title) {
    if (toolbar != null) {
        setSupportActionBar(toolbar);
        if ((getSupportActionBar()) != null) {
            toolbar.setTitle(title);
            getSupportActionBar().setHomeAsUpIndicator(android.support.v4.content.ContextCompat.getDrawable(getApplicationContext(), R.drawable.icon_arrow_back));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }else {
        android.util.Log.d(com.geekhub.choosehelper.screens.activities.ProfileActivity.TAG, "Can`t setup toolbar: Toolbar is null");
    }
}