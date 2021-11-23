@java.lang.Override
public android.os.IInterface createInterface() {
    android.os.IBinder binder = ServiceManager.getService.call(Context.MEDIA_ROUTER_SERVICE);
    return IMediaRouterService.Stub.asInterface.call(binder);
}