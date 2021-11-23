public static void setDelegatedClassLoader(final java.lang.ClassLoader classLoader) {
    synchronized(com.opensymphony.xwork2.util.LocalizedTextUtil.bundlesMap) {
        com.opensymphony.xwork2.util.LocalizedTextUtil.delegatedClassLoader = classLoader;
    }
}