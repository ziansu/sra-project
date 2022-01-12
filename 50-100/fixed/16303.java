@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    actionbar = getSupportActionBar();
    actionbar.setDisplayHomeAsUpEnabled(true);
    buildDrawnerMenu(toolbar);
    addTabs();
    addTabIcons();
    setupTabClick();
}