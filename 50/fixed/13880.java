public void sendPlayerToSpawn(org.bukkit.entity.Player p) {
    if (((getNumberOfSpawns()) == 0) || ((getRandomSpawn(p)) == null)) {
        return ;
    }
    sendPlayerToSpawn(p, getRandomSpawn(p));
}