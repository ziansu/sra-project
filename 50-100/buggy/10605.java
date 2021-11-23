private void removeTransform(org.bukkit.entity.Player player) {
    org.bukkit.Bukkit.getServer().dispatchCommand(org.bukkit.Bukkit.getConsoleSender(), ("clearskin " + (player.getName())));
    turnOff(player);
    sendMessage(player, "You look like yourself again.");
    sendMessage(player, strWarnMessage);
}