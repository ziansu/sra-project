public void sendBroadCast() {
    android.util.Log.i(com.example.sunsai.mymusicplayer.service.MusicService.TAG, "sendBroadCast");
    android.content.Intent intent = new android.content.Intent();
    intent.setAction(PlayerActivity.BROADCAST_MUSICPLAYER);
    intent.putExtra("CurrentPosition", mediaPlayer.getCurrentPosition());
    intent.putExtra("Duration", mediaPlayer.getDuration());
    localBroadcastManager.sendBroadcast(intent);
}