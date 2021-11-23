public void run() {
    java.lang.String msg = com.github.ucchyocean.chatbot.irc.IRCColor.convRES2IRC(format.replace("%name", name).replace("%message", message));
    bot.sendIRC().message(config.getChannel(), msg);
}