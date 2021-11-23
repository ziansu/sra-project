private void initViewPager() {
    ua.te.hackathon.smartcity2015.ui.intro.IntroActivity.ViewPagerAdapter adapter = new ua.te.hackathon.smartcity2015.ui.intro.IntroActivity.ViewPagerAdapter(getSupportFragmentManager());
    adapter.addFragment(ua.te.hackathon.smartcity2015.ui.intro.IntroFragment.newInstance(R.color.blue));
    adapter.addFragment(ua.te.hackathon.smartcity2015.ui.intro.IntroFragment.newInstance(R.color.red));
    adapter.addFragment(ua.te.hackathon.smartcity2015.ui.intro.IntroFinishFragment.newInstance(R.color.green));
    viewPagerInto.setAdapter(adapter);
    indicatordots.setViewPager(viewPagerInto);
}