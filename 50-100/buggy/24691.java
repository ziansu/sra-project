private void checkPlayers() {
    org.bukkit.entity.Player[] online = this.getServer().getOnlinePlayers();
    for (int i = 0; i < (online.length); i++) {
        java.lang.String name = online[i].getName();
        if (nl.lolmen.Skillz.SkillsSettings.isDebug()) {
            this.getLogger().info(("[Debug] Reloading player " + name));
        }
        this.getUserManager().loadPlayer(online[i].getName());
    }
}