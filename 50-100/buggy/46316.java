private void setupTabs() {
    com.customview.pranay.dasmusica.MainActivity.ViewPagerAdapter viewPagerAdapter = new com.customview.pranay.dasmusica.MainActivity.ViewPagerAdapter(getSupportFragmentManager());
    viewPagerAdapter.add(new com.customview.pranay.dasmusica.fragment.SongsListFragment(), "Songs");
    viewPagerAdapter.add(new com.customview.pranay.dasmusica.fragment.AlbumsListFragment(), "Albums");
    viewPagerAdapter.add(new com.customview.pranay.dasmusica.fragment.SongsListFragment(), "Genre");
    viewPager.setAdapter(viewPagerAdapter);
    viewPager.setOffscreenPageLimit(2);
    viewPager.setPageTransformer(false, new com.customview.pranay.dasmusica.pagetransformers.ZoomOutPageTransformer());
}