private void checkWorlds(java.util.Map<java.lang.String, java.lang.Boolean> allowedWorlds) {
    for (org.bukkit.entity.Player player : registeredPlayers) {
        if (!(allowedWorlds.get(player.getWorld().getName())))
            removePlayer(player);
        
    }
}