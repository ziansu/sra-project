private void loadNextProfile() {
    (position)++;
    tunakleague.com.redemption.search.FragmentManager manager = getSupportFragmentManager();
    tunakleague.com.redemption.profiles.BaseProfileFragment profileFragment = ((tunakleague.com.redemption.profiles.BaseProfileFragment) (manager.findFragmentByTag(PROFILE_TAG)));
    if ((position) < (profileList.length())) {
        try {
            profileFragment.renderUI(profileList.getJSONObject(position));
        } catch (org.json.JSONException e) {
            android.util.Log.d(TAG, "Error passing next profile to renderUI() ");
        }
    }else {
        android.util.Log.d(TAG, "No more profiles left to show");
        showNoProfilesEnd();
    }
}