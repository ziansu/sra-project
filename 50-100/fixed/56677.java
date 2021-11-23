public static com.comphenix.protocol.wrappers.WrappedGameProfile getGameProfileWithThisSkin(java.util.UUID uuid, java.lang.String playerName, com.comphenix.protocol.wrappers.WrappedGameProfile profileWithSkin) {
    try {
        com.comphenix.protocol.wrappers.WrappedGameProfile gameProfile = new com.comphenix.protocol.wrappers.WrappedGameProfile((uuid != null ? uuid : java.util.UUID.randomUUID()), playerName);
        if (profileWithSkin != null)
            gameProfile.getProperties().putAll(profileWithSkin.getProperties());
        
        return gameProfile;
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
    return null;
}