@java.lang.Override
protected void onPrivateMessage(java.lang.String sender, java.lang.String login, java.lang.String hostname, java.lang.String message) {
    it.biffi.jirc.bot.event.MessageEvent event = new it.biffi.jirc.bot.event.MessageEvent();
    event.putData(MessageEvent.SENDER, sender);
    event.putData(MessageEvent.LOGIN, login);
    event.putData(MessageEvent.HOSTNAME, hostname);
    event.putData(MessageEvent.MESSAGE, message);
    ebus.addEvent(event);
    super.onPrivateMessage(sender, login, hostname, message);
}