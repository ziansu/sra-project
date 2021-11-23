private void registerEvents() {
    org.bukkit.Bukkit.getPluginManager().registerEvents((this.laserGun = new ml.lasertag.minigame.Mechanics.LaserGun(this)), this);
    org.bukkit.Bukkit.getPluginManager().registerEvents(new ml.lasertag.minigame.Mechanics.PlayerJoin(this), this);
    org.bukkit.Bukkit.getPluginManager().registerEvents(new ml.lasertag.minigame.Mechanics.PlayerChat(this), this);
    org.bukkit.Bukkit.getPluginManager().registerEvents(new ml.lasertag.minigame.GameManager.ArenaSelector(this), this);
    org.bukkit.Bukkit.getPluginManager().registerEvents(new ml.lasertag.minigame.Mechanics.Restrictions(), this);
}