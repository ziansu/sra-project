@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_account);
    br.com.inmypocket.controllers.ActionBarCTR actionBarCTR = new br.com.inmypocket.controllers.ActionBarCTR();
    actionBarCTR.setActionBar(getActionBar(), R.drawable.ic_action_back, R.string.title_activity_account);
    android.support.v4.view.ViewPager mViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.pager)));
    mViewPager.setAdapter(new br.com.inmypocket.adapter.AccountViewPagerAdapter(getFragmentManager()));
    com.astuetz.PagerSlidingTabStrip tabs = ((com.astuetz.PagerSlidingTabStrip) (findViewById(R.id.tab)));
    tabs.setViewPager(mViewPager);
}