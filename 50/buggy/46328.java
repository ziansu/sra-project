public void onPrepared(android.media.MediaPlayer player) {
    startPlayer();
    timePlay = 0;
    android.content.Intent intent = new android.content.Intent(com.example.framgianguyenkeninh.gethtml.AppConst.ON_PREPARED);
    intent.putExtra(AppConst.KEY_DURATION, player.getDuration());
    sendBroadcast(intent);
}