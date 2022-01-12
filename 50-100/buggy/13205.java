@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    android.support.v4.view.ViewPager pager = ((android.support.v4.view.ViewPager) (findViewById(R.id.pager)));
    adapter = new com.commonsware.android.tablayout.SampleAdapter(this, getSupportFragmentManager());
    pager.setAdapter(adapter);
    tabs = ((android.support.design.widget.TabLayout) (findViewById(R.id.tabs)));
    tabs.setupWithViewPager(pager);
    tabs.setTabMode(TabLayout.MODE_FIXED);
}