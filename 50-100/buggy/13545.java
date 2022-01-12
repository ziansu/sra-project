private void checkLoggedIn() {
    if (mSharedPreferences.getBoolean(getString(R.string.logged_in), false)) {
        android.content.Intent i = new android.content.Intent(this, jonahkh.tacoma.uw.edu.fitnesstracker.dashboard.DashboardActivity.class);
        startActivity(i);
        finish();
    }else {
        com.facebook.login.LoginManager mgr = com.facebook.login.LoginManager.getInstance();
        if (mgr != null) {
            mgr.logOut();
        }
    }
}