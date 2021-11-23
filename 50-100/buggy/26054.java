public void onEnable() {
    getLogger().info("WetherEffect Enabled Sucsessfully!!!!!!!!!!!!");
    try {
        org.mcstats.Metrics metrics = new org.mcstats.Metrics(this);
        metrics.start();
    } catch (java.io.IOException e) {
        this.getLogger().info(((org.bukkit.ChatColor.RED) + "Failed to submit the stats"));
    }
    this.getServer().getPluginManager().registerEvents(new jp.mydns.dyukusi.weathereffect.listener.RainBreakBlock(this), this);
}