public boolean isOpen() {
    org.bukkit.World world = plugin.getServer().getWorld(this.config.getString("world"));
    int hour = com.drewpercraft.Utils.GetWorldHour(world.getTime());
    return (hour >= (this.config.getInt("openHour"))) && (hour < (this.config.getInt("closeHour")));
}