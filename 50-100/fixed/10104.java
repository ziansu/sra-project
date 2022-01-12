public int getTeamLinks(org.bukkit.scoreboard.Team team) {
    int result = 0;
    if (((getGameMgr().getGame(team)) != null) && (beaconLinks.containsKey(getGameMgr().getGame(team)))) {
        for (com.wasteofplastic.beaconz.BeaconLink pair : beaconLinks.get(getGameMgr().getGame(team))) {
            if (pair.getOwner().equals(team)) {
                result++;
            }
        }
    }
    return result;
}