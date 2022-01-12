public void removePlayer(org.bukkit.entity.Player player) {
    updateQueue.remove(player);
    attachments.remove(player);
    prefixes.remove(player);
    suffixes.remove(player);
    persistentPermissions.remove(player);
    transientPermissions.remove(player);
    synchronized(debug) {
        debug.remove(player);
    }
}