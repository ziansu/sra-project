public void run() {
    try {
        for (org.bukkit.entity.Player player : registeredPlayers) {
            if ((player.getLocation().getY()) >= (blockLevel)) {
                if ((allowedModes.get(player.getGameMode().toString())) && (isRoofAbovePlayer(player)))
                    player.playSound(player.getLocation(), Sound.ITEM_ELYTRA_FLYING, 1, 1);
                
            }
        }
    } catch (java.lang.NoSuchFieldError e) {
        logger.severe("This plugin only works with 1.9.2 or above. Please update.");
    }
}