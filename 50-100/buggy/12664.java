@java.lang.Override
public void onActivityStarted(android.app.Activity activity) {
    (appCount)++;
    com.ufo.socketioandroiddemo.login.UserInfoRepository userInfoRepository = com.ufo.socketioandroiddemo.login.UserInfoRepository.getInstance();
    com.ufo.socketioandroiddemo.login.UserInfoBean bean = userInfoRepository.currentUser(getApplicationContext());
    if (bean != null) {
        getRecent();
        startSocketIOService();
    }
}