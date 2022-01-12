public void reloadSubs() {
    int current = pager.getCurrentItem();
    adapter = new me.ccrama.redditslide.Activities.MainActivity.OverviewPagerAdapter(getSupportFragmentManager());
    pager.setAdapter(adapter);
    me.ccrama.redditslide.Activities.MainActivity.shouldLoad = usedArray.get(current);
    pager.setCurrentItem(current);
    mTabLayout.setupWithViewPager(pager);
}