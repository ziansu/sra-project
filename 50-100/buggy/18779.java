@java.lang.SuppressWarnings(value = "deprecation")
public void addToTeam(org.bukkit.entity.Player player) {
    com.endercrest.colorcube.game.Game.CCTeam teamToSet = null;
    for (com.endercrest.colorcube.game.Game.CCTeam team : teams.keySet()) {
        if (teamToSet == null) {
            teamToSet = team;
            continue;
        }
        if ((teams.get(team).getSize()) < (teams.get(teamToSet).getSize())) {
            teamToSet = team;
        }
    }
    teams.get(teamToSet).addPlayer(player);
}