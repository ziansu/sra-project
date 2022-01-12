private void checkLoggedIn() {
    if (mSharedPreferences.getBoolean(getString(R.string.logged_in), false)) {
        android.content.Intent i = new android.content.Intent(this, jonahkh.tacoma.uw.edu.fitnesstracker.dashboard.DashboardActivity.class);
        startActivity(i);
        finish();
    }else {
        if ((com.facebook.login.LoginManager.getInstance()) != null) {
            com.facebook.login.LoginManager.getInstance().logOut();
        }
    }
}