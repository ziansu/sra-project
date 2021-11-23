private void unload() {
    getServer().getMessenger().unregisterIncomingPluginChannel(this);
    getServer().getMessenger().unregisterOutgoingPluginChannel(this);
    pluginChannelCommunicator = null;
    org.bukkit.event.HandlerList.unregisterAll(this);
    getServer().getMessenger().unregisterIncomingPluginChannel(this);
    getServer().getMessenger().unregisterOutgoingPluginChannel(this);
    database.close();
    database = null;
    commandManager.close();
    commandManager = null;
}