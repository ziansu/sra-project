private void removeTransform(org.bukkit.entity.Player player) {
    org.bukkit.Bukkit.getServer().dispatchCommand(org.bukkit.Bukkit.getConsoleSender(), ("clearskin " + (player.getName())));
    sendMessage(player, "You look like yourself again.");
    sendMessage(player, strWarnMessage);
}