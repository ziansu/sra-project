public static void addError(org.bukkit.entity.Player player) {
    if (!(ru.mrbrikster.safeauth.PluginManager.authErrors.containsKey(player))) {
        ru.mrbrikster.safeauth.PluginManager.authErrors.put(player, 1);
        return ;
    }
    java.lang.Integer old = ru.mrbrikster.safeauth.PluginManager.authErrors.get(player);
    ru.mrbrikster.safeauth.PluginManager.authErrors.remove(player);
    ru.mrbrikster.safeauth.PluginManager.authErrors.put(player, (++old));
}