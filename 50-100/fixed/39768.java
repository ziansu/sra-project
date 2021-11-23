public com.health.openscale.core.ScaleUser getSelectedScaleUser() {
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    int selectedUserId = prefs.getInt("selectedUserId", (-1));
    if (selectedUserId == (-1)) {
        com.health.openscale.core.ScaleUser scaleUser = new com.health.openscale.core.ScaleUser();
        return scaleUser;
    }
    return scaleUserDB.getScaleUser(selectedUserId);
}