@java.lang.Override
public boolean loadActiveUserInfo(java.lang.Object context) {
    android.content.SharedPreferences appPrefs = getAppSharedPreferences(((android.content.Context) (context)));
    currentUsername = appPrefs.getString(com.ustadmobile.port.android.impl.UstadMobileSystemImplAndroid.KEY_CURRENTUSER, null);
    currentAuth = appPrefs.getString(com.ustadmobile.port.android.impl.UstadMobileSystemImplAndroid.KEY_CURRENTAUTH, null);
    xapiAgent = com.ustadmobile.nanolrs.core.endpoints.XapiAgentEndpoint.createOrUpdate(context, null, currentUsername, com.ustadmobile.core.util.UMTinCanUtil.getXapiServer(context));
    this.userPreferences = null;
    return true;
}