private static synchronized void end(java.lang.String id) {
    long now = java.lang.System.currentTimeMillis();
    if ((br.com.allchemistry.spf.SPF.CacheDefer.MAP.remove(id)) != null) {
        br.com.allchemistry.spf.SPF.CacheDefer.CHANGED = true;
        br.com.allchemistry.core.Server.logDefer(now, id, "END");
    }
}