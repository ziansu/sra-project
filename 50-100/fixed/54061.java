@java.lang.Override
public void onStart(rokid.rkengine.scheduler.AppInfo appInfo) throws android.os.RemoteException {
    if ((appInfo == null) || (android.text.TextUtils.isEmpty(appInfo.appId))) {
        com.rokid.rkengine.utils.Logger.d("onStart appInfo is null");
        return ;
    }
    com.rokid.rkengine.utils.Logger.d(com.rokid.rkengine.scheduler.AppStateManager.TAG, ("onStart " + (appInfo.appId)));
    appStack.pushApp(appInfo);
}