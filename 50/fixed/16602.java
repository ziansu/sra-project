protected void proxyRemovedSwing(T proxy) {
    int i = doProxyRemoved(proxy, false);
    if (i >= 0)
        fireIntervalRemoved(this, i, i);
    
}