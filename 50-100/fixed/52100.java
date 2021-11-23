private void setUpViewPagerAndTabLayout() {
    viewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.main_act_vp)));
    viewPager.setAdapter(new nl.mprog.bubbles.veganproductscanner.TabsFragmentPagerAdapter(getSupportFragmentManager(), this));
    android.support.design.widget.TabLayout tl = ((android.support.design.widget.TabLayout) (findViewById(R.id.main_act_tl)));
    tl.setupWithViewPager(viewPager);
}