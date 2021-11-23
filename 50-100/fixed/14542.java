private void setupPager() {
    mPager.setAdapter(new com.afollestad.polar.adapters.MainPagerAdapter(getFragmentManager(), mPages));
    mPager.setOffscreenPageLimit(((mPages.size()) - 1));
    mPager.setPagingEnabled((!(com.afollestad.polar.config.Config.get().navDrawerModeEnabled())));
}