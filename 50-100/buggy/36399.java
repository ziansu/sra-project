private void setupViewPager(android.support.v4.view.ViewPager viewPager) {
    com.alelievangelista.dryft.ViewPagerAdapter adapter = new com.alelievangelista.dryft.ViewPagerAdapter(getSupportFragmentManager());
    adapter.addFrag(new com.alelievangelista.dryft.DummyFragment(), "WELCOME");
    adapter.addFrag(new com.alelievangelista.dryft.DummyFragment(), "TOUR");
    adapter.addFrag(new com.alelievangelista.dryft.DummyFragment(), "MAP");
    viewPager.setAdapter(adapter);
}