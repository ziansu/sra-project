public void setFriendUsername(java.lang.String friendUsername) {
    this.friendUsername = friendUsername;
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    android.content.SharedPreferences.Editor editor = prefs.edit();
    editor.putString("friendUsername", friendUsername);
    editor.commit();
    android.widget.TextView tv = ((android.widget.TextView) (findViewById(R.id.users_title)));
    tv.setText(friendUsername);
    checkLocation(friendUsername);
}