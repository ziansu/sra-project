public void deauthenticate(org.bukkit.entity.Player player) {
    if (authenticatedUsers.contains(player)) {
        authenticatedUsers.remove(player);
    }
}