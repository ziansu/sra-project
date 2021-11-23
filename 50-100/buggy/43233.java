@java.lang.Override
public void onResume() {
    super.onResume();
    android.content.SharedPreferences pref = android.support.v7.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    java.lang.String s = pref.getString("matchDistance", "1");
    int radius = java.lang.Integer.parseInt(s);
    if ((radius < 0) || (radius > 20)) {
    }else
        if (radius != (mRadius)) {
            mRadius = radius;
            com.firebase.petti.db.API.detachNearbyUsersListener();
            com.firebase.petti.db.API.attachNearbyUsersListener(location, mRadius);
            updateMatches();
        }
    
}