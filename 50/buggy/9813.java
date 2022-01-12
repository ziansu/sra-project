@android.support.annotation.Nullable
public java.lang.String[] listServices() {
    android.os.IBinder sspBinder = me.ycdev.android.lib.common.internalapi.android.os.ServiceManagerIA.getService(mSspName);
    me.ycdev.android.lib.ssproxy.proxy.ISysServiceProxy sspService = me.ycdev.android.lib.ssproxy.proxy.SysServiceProxyNative.asInterface(sspBinder);
    if (sspService != null) {
        return sspService.listServices();
    }
    return null;
}