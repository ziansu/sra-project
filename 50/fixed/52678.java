@java.lang.Override
public void onResponse(java.lang.String username) {
    mLogin = true;
    mPreferences.setUser(username);
    mDrawerGroup.reload();
}