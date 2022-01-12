@java.lang.Override
public void sendMessage(com.st.nicobot.internal.bot.SlackChannel channel, com.st.nicobot.internal.bot.SlackUser origin, java.lang.String message) {
    java.lang.Boolean devMode = props.getBoolean(NicobotProperty.BOT_DEV_MODE);
    if ((!devMode) || (channel.getId().equals(devChan.getId()))) {
        session.sendMessage(channel, formatMessage(message, origin, channel), null, null, null);
    }
}