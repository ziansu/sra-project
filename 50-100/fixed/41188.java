public synchronized java.util.Collection<? extends org.bukkit.entity.Player> getOnlinePlayers() {
    if (((this.cacheCreateTime) + 10) < (java.lang.System.currentTimeMillis())) {
        this.cacheCreateTime = java.lang.System.currentTimeMillis();
        java.util.Collection<? extends org.bukkit.entity.Player> players = org.bukkit.Bukkit.getOnlinePlayers();
        this.onlinePlayersCache.clear();
        for (final org.bukkit.entity.Player p : players) {
            this.onlinePlayersCache.add(p);
        }
    }
    return this.onlinePlayersCache;
}