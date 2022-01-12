@java.lang.Override
public final synchronized void removeAnySubscription(final com.connectsdk.device.ConnectableDevice device) {
    if ((subscriptions) != null) {
        com.connectsdk.service.command.ServiceSubscription<T> l = subscriptions.remove(device.getIpAddress());
        if (l != null) {
            l.unsubscribe();
            org.openhab.binding.connectsdk.internal.bridges.AbstractOpenhabConnectSDKPropertyBridge.logger.debug("Unsubscribed {}:{} listener on IP: {}", getItemClass(), getItemProperty(), device.getIpAddress());
        }
    }
}