public void joinChannel(java.lang.String channel, boolean startup) {
    if ((output) == null) {
        synchronized(tempchannels) {
            tempchannels.put(channel, "");
            com.mak001.ircbot.Boot.getLogger().log(LogType.BOT, (("Added channel " + channel) + " to join queue"));
        }
    }else {
        synchronized(channels) {
            channels.put(channel, new com.mak001.ircbot.irc.Channel(this, channel, startup));
        }
        output.sendRawLine(("JOIN " + channel));
    }
}