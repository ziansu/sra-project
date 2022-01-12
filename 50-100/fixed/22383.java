@java.lang.Override
public void run() {
    org.bukkit.Location destination = spot.toLocation(islandLoc.getWorld());
    player.teleport(destination);
    if (setHome) {
        plugin.getPlayers().setHomeLocation(player.getUniqueId(), destination, homeNumber);
    }
}