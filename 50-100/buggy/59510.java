private void _setLandingContent() {
    java.util.Map<java.lang.Integer, android.app.Fragment> fragmentMap = new java.util.HashMap<>();
    fragmentMap.put(R.id.main_activity_header, new org.railsschool.tiramisu.views.fragments.LandingHeaderFragment());
    fragmentMap.put(R.id.main_activity_body, new org.railsschool.tiramisu.views.fragments.ClassListFragment());
    setFragments(fragmentMap);
    _currentDisplay = org.railsschool.tiramisu.views.activities.MainActivity.CurrentDisplay.LANDING;
}