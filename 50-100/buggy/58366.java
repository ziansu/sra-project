@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity_layout);
    initialize();
    actionBar.setHomeButtonEnabled(true);
    actionBar.setDisplayHomeAsUpEnabled(true);
    homeFragment = new com.apppreview.shuvojit.tourismbd.allpackges.fragments.HomeFragment();
    fragmentManager.beginTransaction().replace(R.id.content_fragment, homeFragment).commit();
    navDrawerListView.setItemChecked(0, true);
}