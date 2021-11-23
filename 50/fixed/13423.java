public <T extends com.blade.plugin.Plugin> T getPlugin(java.lang.Class<T> plugin) {
    if ((null != plugin) && (null != (container))) {
        return container.getBean(plugin, null);
    }
    return null;
}