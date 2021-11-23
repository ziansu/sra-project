public void registerCommands() {
    getCommand("chat").setExecutor(new org.mypixel.wolfgalaxy.chat.ChatControl());
    getCommand("channel").setExecutor(new org.mypixel.wolfgalaxy.chat.channels.Channels());
    getCommand("wgbrb").setExecutor(new org.mypixel.wolfgalaxy.commands.AFK());
    getCommand("wearArmour").setExecutor(new org.mypixel.wolfgalaxy.items.CustomItemsCommands(this));
}