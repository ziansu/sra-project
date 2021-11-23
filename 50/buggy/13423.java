public <T extends com.blade.plugin.Plugin> T getPlugin(java.lang.Class<T> plugin) {
    return container.getBean(plugin, Scope.SINGLE);
}