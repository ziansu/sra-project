@java.lang.Override
public com.ullink.slack.simpleslackapi.SlackMessageHandle<com.ullink.slack.simpleslackapi.replies.SlackChannelReply> leaveChannel(com.ullink.slack.simpleslackapi.SlackChannel channel) {
    com.ullink.slack.simpleslackapi.impl.SlackMessageHandleImpl handle = new com.ullink.slack.simpleslackapi.impl.SlackMessageHandleImpl(getNextMessageId());
    java.util.Map<java.lang.String, java.lang.String> arguments = new java.util.HashMap<>();
    arguments.put("token", authToken);
    arguments.put("channel", channel.getId());
    postSlackCommand(arguments, com.ullink.slack.simpleslackapi.impl.SlackWebSocketSessionImpl.CHANNELS_LEAVE_COMMAND, handle);
    return handle;
}