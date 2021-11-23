public static void Send(sx.blah.discord.api.IDiscordClient client, java.lang.String userID, java.lang.String message) throws sx.blah.discord.util.DiscordException, sx.blah.discord.util.HTTP429Exception, sx.blah.discord.util.MissingPermissionsException {
    sx.blah.discord.handle.obj.IPrivateChannel channel = client.getOrCreatePMChannel(client.getUserByID(userID));
    channel.sendMessage(message);
}