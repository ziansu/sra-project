@java.lang.Override
public void updateSubscriptions(org.linphone.core.LinphoneProxyConfig proxyConfig, boolean onlyWhenRegistered) {
    synchronized(getSyncObject()) {
        updateSubscriptions(nativePtr, ((org.linphone.core.LinphoneProxyConfigImpl) (proxyConfig)).nativePtr, onlyWhenRegistered);
    }
}