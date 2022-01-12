public void team(java.util.List<org.bukkit.entity.Player> players) {
    int max = (players.size()) - 1;
    for (org.bukkit.entity.Player player : players) {
        teamList.get(pos).addPlayer(player);
        (pos)++;
        if ((pos) > max) {
            pos = 0;
        }
    }
    pos = 0;
}