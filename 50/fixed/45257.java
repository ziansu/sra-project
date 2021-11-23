private void checkWorlds() {
    for (org.bukkit.entity.Player player : registeredPlayers) {
        if (!(allowedWorlds.get(player.getWorld().getName())))
            removePlayer(player);
        
    }
}