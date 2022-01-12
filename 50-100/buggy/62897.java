public java.lang.String onPacketReceived(java.lang.String packet) {
    if (!(this.appHooks.containsKey("onPacketReceived")))
        return packet;
    
    try {
        return ((java.lang.String) (callHook("onPacketReceived", packet)));
    } catch (java.lang.Exception e) {
        kclient.tools.Logger.get().error(e);
    }
    return packet;
}