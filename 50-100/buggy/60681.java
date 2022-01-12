@java.lang.Override
public void onEnable() {
    getServer().getPluginManager().registerEvents(this, new me.dasadavid.ban.guiListener());
    this.getCommand("opengui").setExecutor(new me.dasadavid.ban.openGUI());
    this.getCommand("ban").setExecutor(new me.dasadavid.ban.banPlayer());
}