public void team(java.util.List<org.bukkit.entity.Player> players) {
    int max = (teamList.size()) - 1;
    for (org.bukkit.entity.Player player : players) {
        if ((pos) > max) {
            pos = 0;
        }
        teamList.get(pos).addPlayer(player);
        (pos)++;
    }
    pos = 0;
}