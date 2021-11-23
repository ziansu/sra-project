@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.view_pager);
    be.heroesofmightandmagic.www.monsterandcie.ViewPagerActivity.SectionsPagerAdapter mSectionsPagerAdapter = new be.heroesofmightandmagic.www.monsterandcie.ViewPagerActivity.SectionsPagerAdapter(getSupportFragmentManager());
    android.support.v4.view.ViewPager mViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.pager)));
    mViewPager.setAdapter(mSectionsPagerAdapter);
    int currentIndex = getIntent().getIntExtra("monsterNameIndex", 0);
    setTitle(MyAdapter.monstersNameList[currentIndex]);
    mViewPager.setCurrentItem(currentIndex);
}