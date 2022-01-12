public boolean groupCanActionGroup(com.sundays.chat.server.channel.ChannelGroup source, com.sundays.chat.server.channel.ChannelGroup target) {
    return source.childGroups.contains(target.getId());
}