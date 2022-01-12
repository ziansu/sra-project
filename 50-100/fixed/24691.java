private void checkPlayers() {
    java.util.Collection<? extends org.bukkit.entity.Player> online = this.getServer().getOnlinePlayers();
    if ((online.size()) > 0) {
        for (org.bukkit.entity.Player p : online) {
            java.lang.String name = p.getName();
            if (nl.lolmen.Skillz.SkillsSettings.isDebug()) {
                this.getLogger().info(("[Debug] Reloading player " + name));
            }
            this.getUserManager().loadPlayer(p.getName());
        }
    }
}