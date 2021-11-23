private void setupViewPager() {
    tabFragmentPagerAdapter = new com.sven.ou.module.lol.view.HomeFragment.TabFragmentPagerAdapter(getActivity().getSupportFragmentManager());
    tabFragmentPagerAdapter.addFragment(new com.sven.ou.module.lol.view.AuthorInfoFragment(null), getString(R.string.author_info));
    tabFragmentPagerAdapter.addFragment(new com.sven.ou.module.lol.view.NewestVideoFragment(null), getString(R.string.newest_video));
    tabViewpager.setAdapter(tabFragmentPagerAdapter);
}