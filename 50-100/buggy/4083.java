public static java.util.List<java.lang.String> getFriendList(java.util.UUID playerUUID) {
    try {
        java.util.List<java.lang.String> friendList = com.initianovamc.rysingdragon.landprotect.config.PlayerConfig.getPlayerConfig().getConfigNode().getNode("friends", playerUUID, "friendlist").getList(com.google.common.reflect.TypeToken.of(java.lang.String.class));
        return friendList;
    } catch (ninja.leaping.configurate.objectmapping.ObjectMappingException e) {
        e.printStackTrace();
    }
    return new java.util.ArrayList<>();
}