@java.lang.Override
public void onEnable() {
    readConfig();
    getServer().getPluginManager().registerEvents(this, this);
    org.bukkit.plugin.RegisteredServiceProvider<net.milkbowl.vault.chat.Chat> rsp = getServer().getServicesManager().getRegistration(net.milkbowl.vault.chat.Chat.class);
    net.citringo.hageplugin.HagePlugin.chat = rsp.getProvider();
    getLogger().info("onEnable");
}