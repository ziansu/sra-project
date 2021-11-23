public static void main(java.lang.String[] args) throws net.dean.jraw.http.oauth.OAuthException {
    sx.blah.discord.api.IDiscordClient client = utils.Discord.createClient(Keys.DiscordBotToken, true);
    sx.blah.discord.api.events.EventDispatcher dispatcher = client.getDispatcher();
    dispatcher.registerListener(new utils.InterfaceListener());
    utils.Reddit.authenticateReddit();
    de.btobastian.sdcf4j.CommandHandler handler = new de.btobastian.sdcf4j.handler.Discord4JHandler(client);
    handler.setDefaultPrefix("~");
    handler.registerCommand(new Commands.PastaCommand());
    handler.registerCommand(new Commands.JokeCommand());
    handler.registerCommand(new Commands.HelpCommand(handler));
}