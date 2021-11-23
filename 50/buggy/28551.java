@java.lang.Override
public void onClick(android.view.View v) {
    doSearch();
    mSectionsPagerAdapter = new com.vchoose.Vchoose.MainPagerActivity.SectionsPagerAdapter(getSupportFragmentManager(), jsonlist);
    mViewPager.setAdapter(mSectionsPagerAdapter);
}