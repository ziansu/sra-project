public static void setPlayerPassword(java.lang.String playerName, java.lang.String password) {
    java.lang.String securePassword = com.hsun324.protection.ProtectionSystem.getHash(password);
    if (com.hsun324.protection.ProtectionSystem.playerProtectionMap.containsKey(playerName))
        com.hsun324.protection.ProtectionSystem.playerProtectionMap.get(playerName).setPassword(securePassword);
    else
        com.hsun324.protection.ProtectionSystem.playerProtectionMap.put(playerName, new com.hsun324.protection.ProtectionSystem.PlayerProtectionStatus(false, securePassword));
    
}