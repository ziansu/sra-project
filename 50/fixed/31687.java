private void setUpTheViewPager() {
    com.rajasaboor.redditclient.appbar_layout.DetailViewPager detailViewPager = new com.rajasaboor.redditclient.appbar_layout.DetailViewPager(getFragmentManager(), post);
    layoutBinding.detailsViewPager.setAdapter(detailViewPager);
    layoutBinding.detailsTabsLayout.setupWithViewPager(layoutBinding.detailsViewPager);
}