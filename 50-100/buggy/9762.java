@java.lang.Override
public java.lang.Object onHook(java.lang.Object who, java.lang.reflect.Method method, java.lang.Object... args) throws java.lang.Throwable {
    android.app.IServiceConnection conn = ((android.app.IServiceConnection) (args[0]));
    if (conn != null) {
        com.lody.virtual.client.hook.secondary.HackServiceConnection hackConn = HackServiceConnection.sHackConns.remove(conn.asBinder());
        return com.lody.virtual.client.local.VActivityManager.get().unbindService((hackConn != null ? hackConn : conn));
    }
    return false;
}