public boolean isApprovedBuilder(org.bukkit.entity.Player player) {
    return (approvedPlayers.contains(player.getName())) || (player.hasPermission(Ville.PERMISSION_PREMIUM));
}