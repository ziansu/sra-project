private void setupViewPager(android.support.v4.view.ViewPager viewPager) {
    com.skywindow.app.tamed.MainActivity.ViewPagerAdapter adapter = new com.skywindow.app.tamed.MainActivity.ViewPagerAdapter(getSupportFragmentManager());
    adapter.addFragment(new com.skywindow.app.tamed.DogFragment(), "DOG");
    viewPager.setAdapter(adapter);
}