public void registerCommands() {
    getCommand("chat").setExecutor(new org.mypixel.wolfgalaxy.chat.ChatControl());
    getCommand("channel").setExecutor(new org.mypixel.wolfgalaxy.chat.channels.Channels());
    getCommand("wgbrb").setExecutor(new org.mypixel.wolfgalaxy.commands.AFK());
    getCommand("side").setExecutor(new org.mypixel.wolfgalaxy.Sides.SidesMain(this));
    getCommand("wearArmour").setExecutor(new org.mypixel.wolfgalaxy.items.CustomItemsCommands(this));
}