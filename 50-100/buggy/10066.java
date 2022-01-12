public void queuePlayList(com.sedmelluq.discord.lavaplayer.track.AudioPlaylist playlist) {
    java.util.List<com.sedmelluq.discord.lavaplayer.track.AudioTrack> list = playlist.getTracks();
    for (int i = 0; i < (list.size()); i++) {
        if (!(this.player.startTrack(list.get(i), true))) {
            this.queue.offer(list.get(i));
            this.playlist.add(list.get(i).getInfo().title);
        }
    }
}