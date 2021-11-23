@java.lang.Override
public void onResponse(java.lang.String username) {
    mLogin = true;
    mUser = username;
    mPreferences.setUser(username);
    mDrawerGroup.reload();
}