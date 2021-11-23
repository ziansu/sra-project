public void End(com.mcmiddleearth.mcme.events.PVP.maps.Map m) {
    state = GameState.IDLE;
    for (org.bukkit.entity.Player p : org.bukkit.Bukkit.getOnlinePlayers()) {
        com.mcmiddleearth.mcme.events.PVP.Team.removeFromTeam(p);
    }
    getScoreboard().clearSlot(DisplaySlot.SIDEBAR);
    m.playerLeaveAll();
    super.End(m);
}