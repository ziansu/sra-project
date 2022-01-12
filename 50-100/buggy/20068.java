public void queue(com.sedmelluq.discord.lavaplayer.track.AudioTrack track) {
    if (!(this.player.startTrack(track, true))) {
        this.queue.offer(track);
        this.playlist.add(track.getInfo().title);
    }
}