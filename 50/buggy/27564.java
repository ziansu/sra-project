public static java.lang.String getCachedShortHostName() {
    if ((com.google.devtools.build.lib.util.NetUtil.hostname) == null) {
        synchronized(com.google.devtools.build.lib.util.NetUtil.class) {
            if ((com.google.devtools.build.lib.util.NetUtil.hostname) == null) {
                com.google.devtools.build.lib.util.NetUtil.hostname = com.google.devtools.build.lib.util.NetUtil.computeShortHostName();
            }
        }
    }
    return com.google.devtools.build.lib.util.NetUtil.computeShortHostName();
}