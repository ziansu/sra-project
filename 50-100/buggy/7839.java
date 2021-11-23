public static boolean checkLimit(net.dv8tion.jda.core.entities.Guild guild) {
    fredboat.audio.player.GuildPlayer guildPlayer = fredboat.audio.player.PlayerRegistry.getExisting(guild);
    if ((guildPlayer != null) && ((guildPlayer.getSongCount()) > 0))
        return true;
    
    return ((fredboat.audio.player.PlayerLimitManager.limit) > 0) || ((fredboat.audio.player.PlayerRegistry.getPlayingPlayers().size()) < (fredboat.audio.player.PlayerLimitManager.limit));
}