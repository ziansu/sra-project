@java.lang.Override
public void onStart(rokid.rkengine.scheduler.AppInfo appInfo) throws android.os.RemoteException {
    if ((appInfo == null) || (android.text.TextUtils.isEmpty(appInfo.appId))) {
        com.rokid.rkengine.utils.Logger.d("onStart appInfo is null");
        return ;
    }
    com.rokid.rkengine.utils.Logger.d(com.rokid.rkengine.scheduler.AppStateManager.TAG, ("onStart " + (appInfo.appId)));
    if (appInfo.ignoreFromCDomain) {
        com.rokid.rkengine.utils.Logger.d("ignoreFromCDomain don't push app");
        return ;
    }
    if (com.rokid.rkengine.scheduler.AppStateManager.CLOUD_APPID.equals(appInfo.appId)) {
        com.rokid.rkengine.utils.Logger.d("CloudAppInfo has pushed into stack,don't need push more !");
        return ;
    }
    appStack.pushApp(appInfo);
}