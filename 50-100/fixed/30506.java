public void startGuide(android.view.View view) {
    isGuideClosed = false;
    mViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.view_pager)));
    mViewPager.setVisibility(View.VISIBLE);
    mViewPager.setAdapter(new com.android.kalite27.ScriptActivity.GuidePagerAdapter());
    mViewPager.setOnPageChangeListener(new com.android.kalite27.ScriptActivity.GuidePageChangeListener());
}