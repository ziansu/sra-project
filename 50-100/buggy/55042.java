public com.sundays.chat.server.message.MessagePayload createChannelUserUpdate(com.sundays.chat.server.user.User user, com.sundays.chat.server.channel.Channel channel) {
    com.sundays.chat.server.message.MessagePayload message = new com.sundays.chat.server.message.MessagePayload();
    message.put("userID", user.getUserID());
    message.put("username", user.getUsername());
    com.sundays.chat.server.channel.ChannelGroup group = channel.getUserGroup(user.getUserID());
    message.put("group", createGroupDetails(group));
    message.put("rank", group.getLegacyRank());
    return message;
}