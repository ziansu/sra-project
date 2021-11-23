public static void createStatusIfNone(org.bukkit.entity.Player player) {
    if (!(com.hsun324.protection.ProtectionSystem.playerProtectionMap.containsKey(player.getName().toLowerCase())))
        com.hsun324.protection.ProtectionSystem.setPlayerEntry(player.getName().toLowerCase(), false, "");
    
}