@java.lang.Override
public final void unregisterRpcNotificationListener(com.smartdevicelink.protocol.enums.FunctionID functionID, com.smartdevicelink.proxy.rpc.listeners.OnRPCNotificationListener rpcNotificationListener) {
    int id = functionID.getId();
    java.util.HashSet<com.smartdevicelink.proxy.rpc.listeners.OnRPCNotificationListener> listenerSet = mNotificationListeners.get(id);
    if (listenerSet != null) {
        listenerSet.remove(rpcNotificationListener);
        if ((listenerSet.isEmpty()) && ((mSdlProxyALM) != null)) {
            mSdlProxyALM.removeOnRPCNotificationListener(functionID);
        }
    }
}