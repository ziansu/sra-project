public boolean isApprovedBuilder(org.bukkit.entity.Player player) {
    return (approvedPlayers.contains(player)) || (player.hasPermission(Ville.PERMISSION_PREMIUM));
}