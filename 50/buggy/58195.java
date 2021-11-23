public void setUpViewPager(com.codepath.apps.finch.models.User user) {
    vpPager.setAdapter(new com.codepath.apps.finch.activities.ProfileActivity.UserProfilePageAdapter(getSupportFragmentManager(), user));
    tabStrip.setViewPager(vpPager);
}