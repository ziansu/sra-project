public void run() {
    if ((CommandHandler.enabled) == 0) {
        for (org.bukkit.World world : org.bukkit.Bukkit.getServer().getWorlds()) {
            world.setStorm(true);
            org.bukkit.Bukkit.getServer().broadcastMessage(((org.bukkit.ChatColor.RED) + "[RS] RadStorm has been initiated. Take cover!"));
        }
    }
}