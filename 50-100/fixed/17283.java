private me.NoChance.PvPManager.PvPlayer addUser(final me.NoChance.PvPManager.PvPlayer p) {
    if ((org.bukkit.Bukkit.getPlayer(p.getUUID())) != null) {
        players.put(p.getUUID(), p);
        if (configManager.getUserStorage().contains(p.getUUID().toString())) {
            p.loadData(configManager.getUserData(p.getUUID()));
        }
        p.loadState();
    }
    return p;
}