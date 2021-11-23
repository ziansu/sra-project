@java.lang.Override
public void loadingLoginPage(java.lang.String loginUrl) {
    final android.app.ActionBar ab = getActionBar();
    if (ab != null) {
        ab.setTitle(loginUrl);
    }
}