private void setupViewPager(android.support.v4.view.ViewPager viewPager) {
    appy.com.wazznowapp.EventChatFragment.ViewPagerAdapter adapter = new appy.com.wazznowapp.EventChatFragment.ViewPagerAdapter(getSupportFragmentManager());
    adapter.addFragment(new appy.com.wazznowapp.ChatStadiumFragment(), "STADIUM");
    adapter.addFragment(new appy.com.wazznowapp.HousePartyFragment(), "HOUSE PARTY");
    viewPager.setAdapter(adapter);
}