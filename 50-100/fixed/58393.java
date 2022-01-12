public static void stopStream(sx.blah.discord.handle.obj.IGuild guild) {
    sx.blah.discord.util.audio.AudioPlayer player = sx.blah.discord.util.audio.AudioPlayer.getAudioPlayerForGuild(guild);
    player.clear();
    if (de.craxy.discordbot.radio.RadioManager.isStreaming(guild)) {
        try {
            de.craxy.discordbot.radio.RadioManager.audioStreams.remove(guild.getLongID()).close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}