private static com.gmail.trentech.pjc.core.SQLManager init(org.spongepowered.api.plugin.PluginContainer plugin) {
    if (!(com.gmail.trentech.pjc.core.SQLManager.sqlManagers.containsKey(plugin.getId()))) {
        com.gmail.trentech.pjc.core.SQLManager sqlManager = new com.gmail.trentech.pjc.core.SQLManager(plugin);
        return com.gmail.trentech.pjc.core.SQLManager.sqlManagers.put(plugin.getId(), sqlManager);
    }else {
        return com.gmail.trentech.pjc.core.SQLManager.sqlManagers.get(plugin.getId());
    }
}