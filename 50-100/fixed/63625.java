private void volume(IChannel channel, java.lang.Float vol) throws sx.blah.discord.util.DiscordException, sx.blah.discord.util.MissingPermissionsException, sx.blah.discord.util.RateLimitException {
    if (vol > 1.5) {
        vol = 1.5F;
    }
    if (vol < 0) {
        vol = 0.0F;
    }
    getPlayer(getGuild(channel)).setVolume(vol);
    sendMessage(channel, (("Set volume to **" + ((int) (vol * 100))) + "%**."));
}