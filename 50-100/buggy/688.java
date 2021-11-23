@java.lang.Override
public void onEnable() {
    com.gmail.berndivader.mmDisguiseCommand.Main.plugin = this;
    if (((org.bukkit.Bukkit.getServer().getPluginManager().getPlugin("LibsDisguises")) != null) && ((org.bukkit.Bukkit.getServer().getPluginManager().getPlugin("MythicMobs")) != null)) {
        this.getCommand("advdisguise").setExecutor(new com.gmail.berndivader.mmDisguiseCommand.amDisguiseCommand());
        this.getServer().getPluginManager().registerEvents(new com.gmail.berndivader.mmDisguiseCommand.onMMEvents(), this);
    }
}