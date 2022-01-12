@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    android.app.FragmentTransaction trans = getFragmentManager().beginTransaction();
    trans.replace(R.id.mainFragment, new lab.bellkung.thenewkmitl.FeedFragment(), "trans");
    trans.commit();
}