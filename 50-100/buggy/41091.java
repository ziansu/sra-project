public static void setPlayerEntry(java.lang.String playerName, boolean loggedIn, java.lang.String password) {
    if (com.hsun324.protection.ProtectionSystem.playerProtectionMap.containsKey(playerName)) {
        com.hsun324.protection.ProtectionSystem.playerProtectionMap.get(playerName).setLoggedIn(loggedIn);
        com.hsun324.protection.ProtectionSystem.playerProtectionMap.get(playerName).setPassword(password);
    }else
        com.hsun324.protection.ProtectionSystem.playerProtectionMap.put(playerName, new com.hsun324.protection.ProtectionSystem.PlayerProtectionStatus(loggedIn, password));
    
}