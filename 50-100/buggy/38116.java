void isadd(org.bukkit.entity.Player player, org.bukkit.Location loc) {
    if (((list.contains(loc)) && (players.contains(player.getName()))) == false) {
        players.add(player.getName());
        list.add(loc);
        clicks.add(0);
    }
}