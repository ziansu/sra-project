private void setupViewPager(android.support.v4.view.ViewPager viewPager) {
    edu.rosehulman.sunz1.rosechat.adapters.NavigationPagerAdapter adapter = new edu.rosehulman.sunz1.rosechat.adapters.NavigationPagerAdapter(getSupportFragmentManager());
    adapter.addFragment(new edu.rosehulman.sunz1.rosechat.fragments.MessageFragment(), getTitle(R.id.navigation_message));
    adapter.addFragment(new edu.rosehulman.sunz1.rosechat.fragments.ContactsFragment(), getTitle(R.id.navigation_contact));
    adapter.addFragment(new edu.rosehulman.sunz1.rosechat.fragments.ProfileFragment(), getTitle(R.id.navigation_profile));
    adapter.addFragment(new edu.rosehulman.sunz1.rosechat.fragments.EditProfileFragment(), getTitle(R.id.edit_profile));
    viewPager.setAdapter(adapter);
}