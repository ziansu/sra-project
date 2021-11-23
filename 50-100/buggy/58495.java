@java.lang.Override
public void initialize(org.apache.cordova.CordovaInterface cordova, org.apache.cordova.CordovaWebView webView) {
    super.initialize(cordova, webView);
    nl.xservices.plugins.SocialSharing.QQ_APP_ID = preferences.getString(nl.xservices.plugins.SocialSharing.WXAPPID_PROPERTY_KEY, "");
    nl.xservices.plugins.SocialSharing.WECHAT_APP_ID = preferences.getString(nl.xservices.plugins.SocialSharing.QQAPPID_PROPERTY_KEY, "");
    mTencent = com.tencent.tauth.Tencent.createInstance(nl.xservices.plugins.SocialSharing.QQ_APP_ID, cordova.getActivity().getApplicationContext());
}