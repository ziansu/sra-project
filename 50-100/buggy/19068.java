public static java.util.Map.Entry<com.xtra.core.plugin.XtraCorePluginContainer, com.xtra.core.plugin.XtraCoreInternalPluginContainer> getEntryContainerUnchecked(java.lang.Class<?> clazz) {
    for (java.util.Map.Entry<com.xtra.core.plugin.XtraCorePluginContainer, com.xtra.core.plugin.XtraCoreInternalPluginContainer> entry : Internals.plugins.entrySet()) {
        if (entry.getKey().getPlugin().getClass().equals(clazz)) {
            return entry;
        }
    }
    Internals.globalLogger.log(new com.xtra.core.util.exceptions.XtraCoreException((("Cannot find the plugin container entry for " + (clazz.getClass().getName())) + "! Did you pass the wrong object?")));
    return null;
}