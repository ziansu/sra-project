@java.lang.Override
public void playlistLoaded(com.sedmelluq.discord.lavaplayer.track.AudioPlaylist playlist) {
    java.util.List<com.sedmelluq.discord.lavaplayer.track.AudioTrack> tracks = playlist.getTracks();
    for (com.sedmelluq.discord.lavaplayer.track.AudioTrack track : tracks) {
        com.github.drsmugbrain.youtube.Song song = new com.github.drsmugbrain.youtube.Song(track, this.CHANNEL, this.SUBMITTER);
        this.MUSIC_MANAGER.getScheduler().queue(song);
    }
    java.lang.String response = java.lang.String.format("Added %d songs to the queue.", tracks.size());
    com.github.drsmugbrain.util.Bot.sendMessage(this.CHANNEL, response);
}