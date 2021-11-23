public static void setMessagingPlayer(org.bukkit.entity.Player player, org.bukkit.entity.Player messagingWith) {
    org.bukkit.configuration.file.YamlConfiguration data = com.cloudcraftgaming.perworldchatplus.data.PlayerDataManager.getPlayerDataYml(player);
    data.set("Messaging", messagingWith.getUniqueId());
    com.cloudcraftgaming.perworldchatplus.data.PlayerDataManager.savePlayerData(data, com.cloudcraftgaming.perworldchatplus.data.PlayerDataManager.getPlayerDataFile(player));
}