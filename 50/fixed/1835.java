@java.lang.Override
public void onTrackEnd(com.sedmelluq.discord.lavaplayer.player.AudioPlayer player, com.sedmelluq.discord.lavaplayer.track.AudioTrack track, boolean interrupted) {
    fredboat.audio.AbstractPlayer.log.debug(((("Track ended. Interrupted: " + interrupted) + ", player: ") + player));
    if (!interrupted) {
        play0(false);
    }
}