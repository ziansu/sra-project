@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (savedInstanceState == null) {
        getFragmentManager().beginTransaction().replace(R.id.frame_container, new com.todor.imageview.fragment.FolderFragment(), "folder").commit();
    }else {
        fragment = getSupportFragmentManager().getFragment(savedInstanceState, "search");
    }
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    myDrawer = com.todor.imageview.utils.Utils.createCommonDrawer(this, toolbar);
}