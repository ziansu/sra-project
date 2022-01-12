@java.lang.Override
public void onClick(android.view.View v) {
    com.customview.pranay.dasmusica.model.MusicPOJO musicPOJO = com.customview.pranay.dasmusica.model.MusicPOJO.getInstance();
    java.util.ArrayList<com.customview.pranay.dasmusica.model.SongsPojo> list = new java.util.ArrayList(musicPOJO.getSongsList());
    musicPOJO.clearNowPlayingList();
    musicPOJO.setIndexOfCurrentSong(position);
    musicPOJO.setNowPlayingList(list);
    if (position <= (musicPOJO.getNowPlayingList().size())) {
        musicPOJO.getNowPlayingList().get(position).setPalying(true);
        songClickedCallback.songclicked(true, false);
    }
}