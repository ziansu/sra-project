private void seekTo(int position) {
    android.util.Log.d(com.example.sunsai.mymusicplayer.PlayerActivity.TAG, "seekTo");
    android.content.Intent intent = new android.content.Intent(this, com.example.sunsai.mymusicplayer.service.MusicService.class);
    intent.setAction(MusicService.CMD_MUSICSERVICE_SEEKTO);
    intent.putExtra("SEEK_TO", position);
    startService(intent);
}