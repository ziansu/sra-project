@java.lang.Override
protected void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    me.loc2.loc2me.Injector.inject(this);
    setContentView(getLayoutResource());
    toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    if ((toolbar) != null) {
        setSupportActionBar(toolbar);
    }
    getSupportFragmentManager().addOnBackStackChangedListener(new android.support.v4.app.FragmentManager.OnBackStackChangedListener() {
        public void onBackStackChanged() {
            toolbar.setTitle(R.string.app_name);
        }
    });
}