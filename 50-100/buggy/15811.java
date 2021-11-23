protected android.support.v7.widget.Toolbar setupToolbar(boolean home) {
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    if (org.kontalk.util.Preferences.getEasyMode()) {
        toolbar = null;
    }else {
        setSupportActionBar(toolbar);
        if (home)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        
    }
    return toolbar;
}