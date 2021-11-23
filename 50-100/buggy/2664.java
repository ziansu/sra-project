@java.lang.Override
public void onSongsDownloaded(java.util.ArrayList<com.example.user.cloudplayer.model.Song> songs) {
    if (songs == null) {
        android.widget.Toast.makeText(this, getResources().getString(R.string.songs_download_alert), Toast.LENGTH_LONG).show();
        currentPlayList = new java.util.ArrayList<com.example.user.cloudplayer.model.Song>();
    }else {
        currentPlayList = songs;
    }
    adapter = new com.example.user.cloudplayer.adapters.SongAdapter(this, currentPlayList);
    list.setAdapter(adapter);
    android.util.Log.i("irakli", "aqaa");
}