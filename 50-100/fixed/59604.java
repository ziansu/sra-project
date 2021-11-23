public java.lang.String get(java.lang.String key) {
    java.lang.String value = null;
    try {
        value = com.ucas.hcache.memcached.MemCached.mc.get(key);
    } catch (java.util.concurrent.TimeoutException e) {
        e.printStackTrace();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    } catch (net.rubyeye.xmemcached.exception.MemcachedException e) {
        e.printStackTrace();
    }
    return value;
}