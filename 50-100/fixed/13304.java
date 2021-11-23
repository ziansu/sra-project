private void setupViewPager() {
    tabFragmentPagerAdapter = new com.sven.ou.module.lol.view.HomeFragment.TabFragmentPagerAdapter(getActivity().getSupportFragmentManager());
    tabFragmentPagerAdapter.addFragment(new com.sven.ou.module.lol.view.NewestVideoFragment(), getString(R.string.newest_video));
    tabFragmentPagerAdapter.addFragment(new com.sven.ou.module.lol.view.AuthorInfoFragment(), getString(R.string.author_info));
    tabViewpager.setAdapter(tabFragmentPagerAdapter);
}