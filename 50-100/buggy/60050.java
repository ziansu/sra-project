public void initialize(org.apache.cordova.CordovaInterface cordova, org.apache.cordova.CordovaWebView webView) {
    android.util.Log.v(com.htj.plugin.kakao.KakaoTalk.LOG_TAG, "kakao : initialize");
    super.initialize(cordova, webView);
    com.htj.plugin.kakao.KakaoTalk.currentActivity = this.cordova.getActivity();
    try {
        com.kakao.auth.KakaoSDK.init(new com.htj.plugin.kakao.KakaoTalk.KakaoSDKAdapter());
    } catch (com.kakao.auth.KakaoSDK.AlreadyInitializedException e) {
        android.util.Log.v(com.htj.plugin.kakao.KakaoTalk.LOG_TAG, "kakao : initialize is already done");
        return ;
    }
    return ;
}