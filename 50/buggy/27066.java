public void initData() {
    locationService();
    mPagerAdapter = new com.example.guhao.myweather.adapter.CityFragmentPagerAdapter(getSupportFragmentManager());
    viewPager.setAdapter(mPagerAdapter);
    com.example.guhao.myweather.fragment.SingleCityFragment cityFragment = new com.example.guhao.myweather.fragment.SingleCityFragment();
    mPagerAdapter.addFragment(cityFragment);
}