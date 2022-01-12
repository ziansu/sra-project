@java.lang.Override
public void onResponse(com.ober.loc.library.data.BdResolvedResponse o) {
    com.ober.loc.library.tools.ZloLog.d(com.ober.loc.library.core.BaiduGeoResolver.TAG, "onResponse");
    if (!(getRunningFlag())) {
        com.ober.loc.library.tools.ZloLog.w(com.ober.loc.library.core.BaiduGeoResolver.TAG, "runningFlag is false, onResponse return immediately");
        return ;
    }
    notifyRunningState(false);
    mResult = o;
    mEventHandler.sendSuccess();
}