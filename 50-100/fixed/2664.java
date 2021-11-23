@java.lang.Override
public void onSongsDownloaded(java.util.ArrayList<com.example.user.cloudplayer.model.Song> songs) {
    if (songs == null) {
        currentPlayList = new java.util.ArrayList<com.example.user.cloudplayer.model.Song>();
    }else {
        currentPlayList = songs;
    }
    adapter = new com.example.user.cloudplayer.adapters.SongAdapter(this, currentPlayList);
    list.setAdapter(adapter);
}