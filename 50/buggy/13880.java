public void sendPlayerToSpawn(org.bukkit.entity.Player p) {
    if ((getNumberOfSpawns()) == 0) {
        return ;
    }
    sendPlayerToSpawn(p, getRandomSpawn(p));
}