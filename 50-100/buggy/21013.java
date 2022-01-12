@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initGui();
    android.app.FragmentManager fm = getFragmentManager();
    mWorkFragment = ((org.tribler.android.SearchActivityFragment) (fm.findFragmentByTag("work")));
    if ((mWorkFragment) == null) {
        mWorkFragment = new org.tribler.android.SearchActivityFragment();
        fm.beginTransaction().add(mWorkFragment, "work").commit();
    }
    handleIntent(getIntent());
}