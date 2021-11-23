@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.home_activity);
    mToken = io.github.kolacbb.kolaweibo.util.AccessTokenKeeper.readAccessToken(getApplicationContext());
    if (!(mToken.isSessionValid())) {
        loadData(savedInstanceState);
    }else {
        com.sina.weibo.sdk.auth.AuthInfo mAuthInfo = new com.sina.weibo.sdk.auth.AuthInfo(this, io.github.kolacbb.kolaweibo.api.Constants.APP_KEY, io.github.kolacbb.kolaweibo.api.Constants.REDIRECT_URL, io.github.kolacbb.kolaweibo.api.Constants.SCOPE);
        com.sina.weibo.sdk.auth.sso.SsoHandler mSsoHandler = new com.sina.weibo.sdk.auth.sso.SsoHandler(this, mAuthInfo);
        mSsoHandler.authorize(new io.github.kolacbb.kolaweibo.ui.activity.HomeActivity.AuthListener());
    }
}