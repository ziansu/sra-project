public static void setPlayerAttempts(org.bukkit.entity.Player player, int attempts) {
    java.lang.String playerName = player.getName().toLowerCase();
    if (com.hsun324.protection.ProtectionSystem.playerProtectionMap.containsKey(playerName))
        com.hsun324.protection.ProtectionSystem.playerProtectionMap.get(playerName).setAttempts(attempts);
    else {
        com.hsun324.protection.ProtectionSystem.PlayerProtectionStatus newStatus = new com.hsun324.protection.ProtectionSystem.PlayerProtectionStatus(false, playerName);
        newStatus.setAttempts(attempts);
        com.hsun324.protection.ProtectionSystem.playerProtectionMap.put(playerName, newStatus);
    }
}