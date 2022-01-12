@java.lang.Override
public void onClick(android.view.View view) {
    if (view == (btnProfile)) {
        gotoLoginActivity();
    }else
        if (view == (btnAbout)) {
            java.lang.String url = mFirebaseRemoteConfig.getString(Helper.ABOUT_URL_CONFIG_KEY);
            com.appspace.evyalert.util.ChromeCustomTabUtil.open(this, url);
        }else
            if (view == (fabAddEvent)) {
                if (isAcceptableAccuracy) {
                    openPostEventActivity();
                }else {
                    android.support.design.widget.Snackbar.make(fabAddEvent, R.string.wait_gps, Snackbar.LENGTH_SHORT).show();
                }
            }
        
    
}