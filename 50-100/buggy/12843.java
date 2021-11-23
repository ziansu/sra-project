public static boolean isPlayerLoggedIn(java.lang.String name) {
    if (!(com.hsun324.protection.Protection.getInstance().isEnabled()))
        return true;
    
    if (com.hsun324.protection.ProtectionSystem.playerProtectionMap.containsKey(name))
        return com.hsun324.protection.ProtectionSystem.playerProtectionMap.get(name).isLoggedIn();
    
    return false;
}