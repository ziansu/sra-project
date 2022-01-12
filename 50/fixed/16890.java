public void displayTeamInActionBar(org.bukkit.entity.Player player) {
    eu.carrade.amaury.UHCReloaded.teams.UHTeam team = getTeamForPlayer(player);
    if (team == null)
        return ;
    
    displayTeamInActionBar(player, team);
}