public void setPitch(double pitch) {
    if ((media.getMediaType()) == (de.danoeh.antennapod.feed.MediaType.AUDIO)) {
        de.danoeh.antennapod.util.playback.AudioPlayer audioPlayer = ((de.danoeh.antennapod.util.playback.AudioPlayer) (player));
        if (audioPlayer.canSetPitch()) {
            audioPlayer.setPlaybackPitch(((float) (pitch)));
        }
    }
}