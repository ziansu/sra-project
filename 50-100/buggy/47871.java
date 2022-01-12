public void run() {
    init();
    try {
        while (true) {
            java.util.Vector<com.object0r.tools.proxymity.datatypes.ProxyInfo> proxyInfos = getProxiesToTest();
            synchronized(this) {
                proxies.addAll(proxyInfos);
            }
            markDead();
            sleepWhileHaveProxies();
            synchronized(this) {
                proxies.addAll(getDeadProxiesForCheck(5000));
            }
            sleepWhileHaveProxies();
            sleepWhileHaveProxies();
        } 
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}