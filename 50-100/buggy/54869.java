@java.lang.Override
protected void onJoin(java.lang.String channel, java.lang.String sender, java.lang.String login, java.lang.String hostname) {
    java.lang.System.out.println(((("onJoin: " + sender) + " - ") + login));
    it.biffi.jirc.bot.event.JoinEvent event = new it.biffi.jirc.bot.event.JoinEvent();
    event.putData(JoinEvent.CHANNEL, channel);
    event.putData(JoinEvent.SENDER, sender);
    event.putData(JoinEvent.LOGIN, login);
    event.putData(JoinEvent.HOSTNAME, hostname);
    ebus.addEvent(event);
    super.onJoin(channel, sender, login, hostname);
}