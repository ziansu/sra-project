private void updatePlayer(java.lang.String state) {
    android.media.MediaMetadataRetriever mmr = new android.media.MediaMetadataRetriever();
    mmr.setDataSource(path);
    data = mmr.getEmbeddedPicture();
    android.content.Intent intent = new android.content.Intent(com.sarabjeet.musical.utils.Constants.PLAYER.PLAY);
    intent.putExtra("Player", state);
    intent.putExtra("Path", path);
    intent.putExtra("Artist", artist);
    intent.putExtra("Title", title);
    broadcastManager.sendBroadcast(intent);
}