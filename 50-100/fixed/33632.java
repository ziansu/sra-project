public static void setPlayerLoggedIn(java.lang.String playerName, boolean loggedIn) {
    playerName = playerName.toLowerCase();
    if (com.hsun324.protection.ProtectionSystem.playerProtectionMap.containsKey(playerName))
        com.hsun324.protection.ProtectionSystem.playerProtectionMap.get(playerName).setLoggedIn(loggedIn);
    else
        com.hsun324.protection.ProtectionSystem.playerProtectionMap.put(playerName, new com.hsun324.protection.ProtectionSystem.PlayerProtectionStatus(loggedIn, ""));
    
}