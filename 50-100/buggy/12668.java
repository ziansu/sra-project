public io.rocketchat.livechat.LiveChatAPI.ChatRoom createRoom(java.lang.String userID, java.lang.String authToken) {
    java.lang.String userName = userInfo.optString("username");
    java.lang.String visitorToken = LiveChatBasicRPC.visitorToken;
    java.lang.String roomID = io.rocketchat.common.utils.Utils.shortUUID();
    return new io.rocketchat.livechat.LiveChatAPI.ChatRoom(userName, roomID, userID, visitorToken, authToken);
}