public com.health.openscale.core.ScaleUser getSelectedScaleUser() {
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    int selectedUserId = prefs.getInt("selectedUserId", (-1));
    if (selectedUserId == (-1)) {
        com.health.openscale.core.ScaleUser scaleUser = new com.health.openscale.core.ScaleUser();
        scaleUser.id = -1;
        scaleUser.user_name = "anonymous";
        scaleUser.birthday = new java.util.Date();
        scaleUser.scale_unit = 1;
        scaleUser.body_height = 1;
        return scaleUser;
    }
    return scaleUserDB.getScaleUser(selectedUserId);
}