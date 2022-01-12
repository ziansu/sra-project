@java.lang.Override
public void register(java.lang.String pluginName) throws android.os.RemoteException {
    if (!(plugins.contains(pluginName))) {
        plugins.add(pluginName);
    }
}