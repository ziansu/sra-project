@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_owner_home);
    butterknife.ButterKnife.bind(this);
    presenter = new zekisanmobile.petsitter.Owner.OwnerHomePresenterImpl(this);
    configureToolbar();
    configureTabLayout();
    configureNavigationDrawer();
    configureNavigationView();
}