@java.lang.Override
protected void onStart() {
    super.onStart();
    if ((!(nmct.jaspernielsmichielhein.watchfriends.helper.AuthHelper.isUserLoggedIn(this))) || (nmct.jaspernielsmichielhein.watchfriends.helper.AuthHelper.isTokenExpired(this))) {
        nmct.jaspernielsmichielhein.watchfriends.helper.AuthHelper.logUserOff(this);
        com.facebook.login.LoginManager.getInstance().logOut();
        showLoginActivity();
    }
}