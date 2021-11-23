@java.lang.Override
protected void onStart() {
    super.onStart();
    if ((nmct.jaspernielsmichielhein.watchfriends.helper.AuthHelper.isUserLoggedIn(this)) && (!(nmct.jaspernielsmichielhein.watchfriends.helper.AuthHelper.isTokenExpired(this)))) {
        navigate(nmct.jaspernielsmichielhein.watchfriends.view.HomeFragment.newInstance(), "homeFragment");
    }else {
        nmct.jaspernielsmichielhein.watchfriends.helper.AuthHelper.logUserOff(this);
        com.facebook.login.LoginManager.getInstance().logOut();
        showLoginActivity();
    }
}