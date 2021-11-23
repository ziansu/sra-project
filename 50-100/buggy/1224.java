public static java.util.List<com.larvalabs.redditchat.dataobj.JsonActiveChatRoom> getActiveRooms(int limit) {
    java.util.TreeSet<java.lang.String> activeRooms = com.larvalabs.redditchat.util.RedisUtil.getActiveRooms(limit);
    java.util.List<com.larvalabs.redditchat.dataobj.JsonActiveChatRoom> activeRoomsList = new java.util.ArrayList<>();
    int rank = 1;
    for (java.lang.String roomName : activeRooms) {
        com.larvalabs.redditchat.dataobj.JsonChatRoom jsonChatRoom = com.larvalabs.redditchat.dataobj.BreakerCache.getJsonChatRoom(roomName);
        activeRoomsList.add(new com.larvalabs.redditchat.dataobj.JsonActiveChatRoom(0, roomName, jsonChatRoom.displayName, jsonChatRoom.iconUrl, 1, rank));
        rank++;
    }
    return activeRoomsList;
}