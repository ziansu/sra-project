public void sendBroadCast() {
    android.content.Intent intent = new android.content.Intent();
    intent.setAction(PlayerActivity.BROADCAST_MUSICPLAYER);
    intent.putExtra("CurrentPosition", mediaPlayer.getCurrentPosition());
    intent.putExtra("Duration", mediaPlayer.getDuration());
    localBroadcastManager.sendBroadcast(intent);
}