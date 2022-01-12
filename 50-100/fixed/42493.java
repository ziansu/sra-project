@java.lang.Override
public void onEnable() {
    this.viewDistance = ((int) (java.lang.Math.round((((java.lang.Math.sqrt(3)) * 16) * (this.getServer().getViewDistance())))));
    this.getServer().getPluginManager().registerEvents(this, this);
    this.getLogger().info("Enabled.");
}