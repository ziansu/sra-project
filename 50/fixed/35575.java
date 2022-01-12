@java.lang.Override
public boolean update() {
    com.jfinal.plugin.ehcache.CacheKit.remove(io.jpress.model.CACHE_NAME, getOptionKey());
    return super.update();
}