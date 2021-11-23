@java.lang.Override
protected void onChannelInfo(java.lang.String channel, int userCount, java.lang.String topic) {
    java.lang.System.out.println("onChannelInfo");
    it.biffi.jirc.bot.event.ChannelInfoEvent event = new it.biffi.jirc.bot.event.ChannelInfoEvent();
    event.putData(ChannelInfoEvent.CHANNEL, channel);
    event.putData(ChannelInfoEvent.HOSTNAME, bot.getServer());
    event.putData(ChannelInfoEvent.CHANNEL_TOPIC, topic);
    event.putData(ChannelInfoEvent.CHANNEL_USER_COUNT, ("" + userCount));
    ebus.addEvent(event);
    super.onChannelInfo(channel, userCount, topic);
}