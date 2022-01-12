@java.lang.Override
public java.lang.Object call(java.lang.Object who, java.lang.reflect.Method method, java.lang.Object... args) throws java.lang.Throwable {
    android.app.IServiceConnection conn = ((android.app.IServiceConnection) (args[0]));
    com.lody.virtual.client.hook.secondary.ServiceConnectionDelegate delegate = com.lody.virtual.client.hook.secondary.ServiceConnectionDelegate.removeDelegate(conn);
    if (delegate == null) {
        return method.invoke(who, args);
    }
    return com.lody.virtual.client.local.VActivityManager.get().unbindService(delegate);
}