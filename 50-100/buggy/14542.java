private void setupPager() {
    mPager.setAdapter(new com.afollestad.polar.adapters.MainPagerAdapter(getFragmentManager(), mPages));
    mPager.setOffscreenPageLimit(mPages.size());
    mPager.setPagingEnabled((!(com.afollestad.polar.config.Config.get().navDrawerModeEnabled())));
}