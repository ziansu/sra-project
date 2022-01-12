@java.lang.SuppressWarnings(value = "resource")
public static void startListener() throws com.twitchplays.bot.IrcException, com.twitchplays.bot.NickAlreadyInUseException, java.io.IOException {
    com.twitchplays.bot.IRCConnect twitch = new com.twitchplays.bot.IRCConnect();
    twitch.setVerbose(true);
    twitch.connect(com.twitchplays.bot.IRCConnect.server, com.twitchplays.bot.IRCConnect.port, com.twitchplays.bot.IRCConnect.oAuth);
    twitch.joinChannel(com.twitchplays.bot.IRCConnect.channel);
    java.util.Scanner console = new java.util.Scanner(java.lang.System.in);
    if (console.hasNext())
        twitch.sendMessage(com.twitchplays.bot.IRCConnect.channel, console.nextLine());
    else
        twitch.sendMessage(com.twitchplays.bot.IRCConnect.channel, console.nextLine());
    
}