public static com.example.administrator.leehom.thread.ThreadPoolProxy getNormalThreadPoolProxy() {
    if ((com.example.administrator.leehom.thread.ThreadPoolProxyFactory.mNormalThreadPoolProxy) == null) {
        synchronized(com.example.administrator.leehom.thread.ThreadPoolProxyFactory.class) {
            if ((com.example.administrator.leehom.thread.ThreadPoolProxyFactory.mNormalThreadPoolProxy) == null) {
                com.example.administrator.leehom.thread.ThreadPoolProxyFactory.mNormalThreadPoolProxy = new com.example.administrator.leehom.thread.ThreadPoolProxy(5, 5);
            }
        }
    }
    return com.example.administrator.leehom.thread.ThreadPoolProxyFactory.mNormalThreadPoolProxy;
}