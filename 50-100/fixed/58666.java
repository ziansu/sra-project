private void updatePlayer() {
    android.media.MediaMetadataRetriever mmr = new android.media.MediaMetadataRetriever();
    mmr.setDataSource(path);
    data = mmr.getEmbeddedPicture();
    android.content.Intent intent = new android.content.Intent(com.sarabjeet.musical.utils.Constants.PLAYER.PLAY);
    intent.putExtra("Path", path);
    intent.putExtra("Artist", artist);
    intent.putExtra("Title", title);
    broadcastManager.sendBroadcast(intent);
}